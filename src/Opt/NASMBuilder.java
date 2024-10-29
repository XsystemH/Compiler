package Opt;

import ASM.ASMInstr.*;
import ASM.section.*;
import Backend.ASMBuilder;
import Backend.IRBuilder;
import IR.Expression.Constant.Cons;
import IR.Expression.Expr;
import IR.Expression.Register.Reg;
import IR.Instruction.*;
import IR.funcDef;
import IR.mainFn;

import java.util.*;

public class NASMBuilder {
    public IRBuilder irBuilder;

    public TextSection textSection = new TextSection();
    public DataSection dataSection = new DataSection();
    public RodataSection roDataSection = new RodataSection();

    public int funcNum = 0;

    public NASMBuilder(IRBuilder ir) {
        irBuilder = ir;
        visitProgram();
    }

    private String IR2RiscV(String str){
        String ret = str.replace("\\22", "\\\"");
        ret = ret.replace("\\0A", "\\n");
        ret = ret.replace("\\5C", "\\\\");
        return ret;
    }

    private boolean outOfBound(int imm) {
        return imm < -2048 || imm > 2047;
    }

    private String physicName(int id) {
        if (id < 8) {
            return "a" + id;
        }
        if (id < 20) {
            return "s" + (id - 8);
        }
        throw new RuntimeException("reg ID out of bound");
    }

    private ArrayList<ASMInstr> Imm(String op, String rd, String rs, int imm) {
        ArrayList<ASMInstr> instrs = new ArrayList<>();
        if (outOfBound(imm)) {
            LiInstr li = new LiInstr();
            li.rd = "t6";
            li.val = imm;
            instrs.add(li);

            ArithInstr ar = new ArithInstr();
            ar.opType = op;
            ar.rd = rd;
            ar.rs1 = rs;
            ar.rs2 = "t6";
            instrs.add(ar);

            return instrs;
        }
        ImmInstr im = new ImmInstr();
        if (Objects.equals(op, "sltu"))
            im.opType = "sltiu";
        else im.opType = op + "i";
        im.rd = rd;
        im.rs = rs;
        im.imm = imm;
        instrs.add(im);

        return instrs;
    }

    private ArrayList<ASMInstr> Sw(String src, int offset, String rd) {
        ArrayList<ASMInstr> instrs = new ArrayList<>();
        if (outOfBound(offset)) {
            LiInstr li = new LiInstr();
            li.rd = "t6";
            li.val = offset;
            instrs.add(li);

            ArithInstr ar = new ArithInstr();
            ar.opType = "add";
            ar.rd = "t6";
            ar.rs1 = rd;
            ar.rs2 = "t6";
            instrs.add(ar);

            SwInstr sw = new SwInstr();
            sw.src = src;
            sw.offset = 0;
            sw.dest = "t6"; // not sp
            instrs.add(sw);
            return instrs;
        }
        SwInstr sw = new SwInstr();
        sw.src = src;
        sw.offset = offset;
        sw.dest = rd;
        instrs.add(sw);
        return instrs;
    }

    public ArrayList<ASMInstr> Lw(String rd, int offset, String rs) {
        ArrayList<ASMInstr> instrs = new ArrayList<>();
        if (outOfBound(offset)) {
            LiInstr li = new LiInstr();
            li.rd = "t6";
            li.val = offset;
            instrs.add(li);

            ArithInstr ar = new ArithInstr();
            ar.opType = "add";
            ar.rd = "t6";
            ar.rs1 = rs;
            ar.rs2 = "t6";
            instrs.add(ar);

            LwInstr lw = new LwInstr();
            lw.dest = rd;
            lw.offset = 0;
            lw.base = "t6";
            instrs.add(lw);
            return instrs;
        }
        LwInstr lw = new LwInstr();
        lw.dest = rd;
        lw.offset = offset;
        lw.base = rs;
        instrs.add(lw);
        return instrs;
    }

    public void visitProgram() {
        buildStringCons();
        buildGlobalVars();
        for (Instr irInstr : irBuilder.program.instrs) {
            if (irInstr instanceof funcDef func) {
                funcNum++;
                buildFunction(func);
            }
        }
    }

    private void buildStringCons() {
        for (Instr irInstr : irBuilder.strPreDef.instrs) {
            if (irInstr instanceof preStrInstr preStr) {
                String str = IR2RiscV(preStr.str);
                String label = preStr.reg.getString().substring(1);
                roDataSection.addStr(str, label);
            }
        }
    }

    private void buildGlobalVars(){
        for (Instr irInstr : irBuilder.program.instrs) {
            if (irInstr instanceof globalInstr global) {
                String varName = global.result.getString().substring(1);
                dataSection.addGlobalVar("0", varName);
            }
        }
    }

    private void buildFunction(funcDef irFunc) {
        ASMFunction func = new ASMFunction();
        if (irFunc.className != null)
            func.name = irFunc.className + ".." + irFunc.name;
        else func.name = irFunc.name;
        int size = 92 + (irFunc.params.size() + irFunc.cfg.activePeriods.size() - irFunc.cfg.reg_map.size()) * 4;
        int maxSpiltArgs = 0;
        for (BasicBlock block : irFunc.cfg.rpo)
            for (Instr instr : block.Instrs)
                if (instr instanceof callInstr call)
                    maxSpiltArgs = Math.max(call.paramExpr.size() - 8, maxSpiltArgs);
        size += maxSpiltArgs * 4;
        func.spOffset = (size / 16 + (size % 16 == 0 ? 0 : 1)) * 16;
        func.curOffset = 0;

        func.allReg.addAll(irFunc.cfg.sortedAP);

        ASMBlock block = new ASMBlock();
        block.label = func.name;
        block.isGlobal = true;
        block.alignSize = 2;
        block.parent = func;
        func.curBlock = block;
        func.blocks.add(func.curBlock);

        func.idxNum = funcNum;
        func.head = "B" + funcNum + ".";
        func.curBlock.instrs.addAll(Imm("add", "sp", "sp", -func.spOffset));
        func.curBlock.instrs.addAll(Sw("ra", func.alloc(4), "sp"));

        for (int i = 0; i < irFunc.params.size(); i++) {
            if (i < 8) {
                int offset = func.alloc(4);
                func.curBlock.instrs.addAll(Sw("a" + i, offset, "sp"));
                func.putVirtualReg("%" + irFunc.params.get(i), offset);
            }
            else {
                func.putVirtualReg("%" + irFunc.params.get(i), func.spOffset + (i - 8) * 4);
            }
        }

        for (BasicBlock irBlock : irFunc.cfg.rpo) {
            if (!Objects.equals(irBlock.Label.getLabel(), "%entry")) {
                func.newBlock(func.head + irBlock.Label.getLabel().substring(1));
            }
            for (Instr instr : irBlock.Instrs) {
                try {
                    visitIRInstr(instr, func, irFunc.cfg.reg_map);
                }
                catch (RuntimeException e) {
                    continue;
                }
            }
            visitIRInstr(irBlock.Ctrl, func, irFunc.cfg.reg_map);
        }
        textSection.functions.add(func);

        if (irFunc instanceof mainFn main) {
            funcNum++;
            buildFunction(main.init);
        }
    }

    void visitIRInstr(Instr instr, ASMFunction func, HashMap<String, Integer> reg_map) {
        if (instr instanceof binInstr bin) {
            visitBin(bin, func, reg_map);
        }
        else if (instr instanceof brInstr br) {
            visitBr(br, func, reg_map);
        }
        else if (instr instanceof callInstr call) {
            visitCall(call, func, reg_map);
        }
        else if (instr instanceof getInstr get) {
            visitGet(get, func, reg_map);
        }
        else if (instr instanceof icmpInstr icmp) {
            visitIcmp(icmp, func, reg_map);
        }
        else if (instr instanceof loadInstr load) {
            visitLoad(load, func, reg_map);
        }
        else if (instr instanceof retInstr ret) {
            visitRet(ret, func, reg_map);
        }
        else if (instr instanceof selectInstr select) {
            visitSelect(select, func, reg_map);
        }
        else if (instr instanceof storeInstr store) {
            visitStore(store, func, reg_map);
        }
        else if (instr instanceof moveInstr move) {
            visitMove(move, func, reg_map);
        }
        else throw new RuntimeException("Unknown instr: " + instr);
    }

    private void getReg(Expr expr, String dest, ASMFunction func, HashMap<String, Integer> reg_map) {
        if (expr instanceof Reg reg) {
            String regName = reg.getString();
            if (regName.startsWith("@")) {
                LaInstr la = new LaInstr();
                la.rd = dest;
                la.label = regName.substring(1);
                func.curBlock.instrs.add(la);
            }
            else if (regName.startsWith("%")) {
                if (reg_map.containsKey(regName)) {
                    String physic = physicName(reg_map.get(regName));
                    MvInstr mv = new MvInstr();
                    mv.rd = dest;
                    mv.rs = physic;
                    func.curBlock.instrs.add(mv);
                }
                else {
                    int offset = func.getVirtualReg(regName);
                    func.curBlock.instrs.addAll(Lw(dest, offset, "sp"));
                }
            }
            else throw new RuntimeException("wrong reg name: " + regName);
        }
        else if (expr instanceof Cons cons) {
            int val;
            String str = cons.getString();
            if (str.equals("true")) val = 1;
            else if (str.equals("false")) val = 0;
            else if (str.equals("null")) val = 0;
            else val = Integer.parseInt(str);
            LiInstr li = new LiInstr();
            li.rd = dest;
            li.val = val;
            func.curBlock.instrs.add(li);
        }
    }

    private void storeReg(String src, String dest, ASMFunction func, HashMap<String, Integer> reg_map) {
        if (reg_map.containsKey(dest)) {
            String physic = physicName(reg_map.get(dest));
            MvInstr mv = new MvInstr();
            mv.rd = physic;
            mv.rs = src;
            func.curBlock.instrs.add(mv);
        }
        else if (dest.startsWith("@")) {
            LaInstr la = new LaInstr();
            la.rd = "t1";
            la.label = dest.substring(1);
            func.curBlock.instrs.add(la);
            SwInstr sw = new SwInstr();
            sw.src = src;
            sw.dest = "t1";
            sw.offset = 0;
            func.curBlock.instrs.add(sw);
        }
        else {
            int offset = func.getVirtualReg(dest);
            func.curBlock.instrs.addAll(Sw(src, offset, "sp"));
        }
    }

    private void visitBin(binInstr bin, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(bin.operand1, "t1", func, regMap);
        getReg(bin.operand2, "t2", func, regMap);
        ArithInstr ar = new ArithInstr();
        switch (bin.op) {
            case add -> ar.opType = "add";
            case sub -> ar.opType = "sub";
            case mul -> ar.opType = "mul";
            case sdiv -> ar.opType = "div";
            case srem -> ar.opType = "rem";
            case shl -> ar.opType = "sll";
            case ashr -> ar.opType = "sra";
            case and -> ar.opType = "and";
            case or -> ar.opType = "or";
            case xor -> ar.opType = "xor";
        }
        ar.rd = "t0";
        ar.rs1 = "t1";
        ar.rs2 = "t2";
        func.curBlock.instrs.add(ar);
        storeReg("t0", bin.result.getString(), func, regMap);
    }

    private void visitBr(brInstr br, ASMFunction func, HashMap<String, Integer> regMap) {
        if (br.cond == null) {
            JInstr j = new JInstr();
            j.label = func.head + br.destLabel.getLabel().substring(1);
            func.curBlock.instrs.add(j);
            return;
        }
        getReg(br.cond, "t0", func, regMap);
        BranchInstr bi = new BranchInstr();
        bi.op = "bnez";
        bi.rs1 = "t0";
        bi.label = func.head + br.trueLabel.getLabel().substring(1);
        func.curBlock.instrs.add(bi);
        JInstr j = new JInstr();
        j.label = func.head + br.falseLabel.getLabel().substring(1);
        func.curBlock.instrs.add(j);
    }

    private void visitCall(callInstr call, ASMFunction func, HashMap<String, Integer> regMap) {
        for (int i = 0; i < 8; i++) {
            if (call.occupied.get(i))
                func.curBlock.instrs.addAll(Sw("a" + i, func.spOffset - 36 + (7 - i) * 4, "sp"));
        }
        for (int i = 0; i < 12; i++) {
            if (call.occupied.get(i + 8))
                func.curBlock.instrs.addAll(Sw("s" + i, func.spOffset - 84 + (11 - i) * 4, "sp"));
        }

        int extra = 0;
        int curOffset = 0;

        for (int i = 0; i < call.paramExpr.size(); i++) {
            if (i == 8) {
                extra =( call.paramExpr.size() - 8) * 4;
                func.curBlock.instrs.addAll(Imm("add", "sp", "sp", -extra));
            }
            if (i < 8) {
                if (regMap.containsKey(call.paramExpr.get(i).getString())) {
                    int id = regMap.get(call.paramExpr.get(i).getString());
                    if (call.occupied.get(id) || id < i) {
                        int off = 0;
                        if (id < 8) off = func.spOffset - 36 + (7 - id) * 4;
                        else if (id < 20) off = func.spOffset - 84 + (11 - id + 8) * 4;
                        func.curBlock.instrs.addAll(Lw("t0", off, "sp"));
                        MvInstr mv = new MvInstr();
                        mv.rd = "a" + i;
                        mv.rs = "t0";
                        func.curBlock.instrs.add(mv);
                    }
                    else {
                        MvInstr mv = new MvInstr();
                        mv.rd = "a" + i;
                        mv.rs = physicName(id);
                        func.curBlock.instrs.add(mv);
                    }
                } else {
                    getReg(call.paramExpr.get(i), "a" + i, func, regMap);
                }
            }
            else {
                if (regMap.containsKey(call.paramExpr.get(i).getString())) {
                    int id = regMap.get(call.paramExpr.get(i).getString());
                    if (call.occupied.get(id) || id < i) {
                        int off = 0;
                        if (id < 8) off = func.spOffset - 36 + (7 - id) * 4;
                        else if (id < 20) off = func.spOffset - 84 + (11 - id + 8) * 4;
                        func.curBlock.instrs.addAll(Lw("t0", off, "sp"));
                    }
                    else {
                        MvInstr mv = new MvInstr();
                        mv.rd = "t0";
                        mv.rs = physicName(id);
                        func.curBlock.instrs.add(mv);
                    }
                } else {
                    getReg(call.paramExpr.get(i), "t0", func, regMap);
                }
                func.curBlock.instrs.addAll(Sw("t0", curOffset, "sp"));
                curOffset += 4;
            }
        }

        CallInstr ca = new CallInstr();
        if (call.className != null)
            ca.func = call.className + ".." + call.methodName;
        else ca.func = call.methodName;
        func.curBlock.instrs.add(ca);

        if (extra > 0)
            func.curBlock.instrs.addAll(Imm("add", "sp", "sp", extra));
        if (call.returnType != null) {
            MvInstr mv = new MvInstr();
            mv.rd = "t0";
            mv.rs = "a0";
            func.curBlock.instrs.add(mv);
        }

        for (int i = 0; i < 8; i++) {
            if (call.occupied.get(i))
                func.curBlock.instrs.addAll(Lw("a" + i, func.spOffset - 36 + (7 - i) * 4, "sp"));
        }
        for (int i = 0; i < 12; i++) {
            if (call.occupied.get(i + 8))
                func.curBlock.instrs.addAll(Lw("s" + i, func.spOffset - 84 + (11 - i) * 4, "sp"));
        }

        if (call.returnType != null)
            storeReg("t0", call.result.getString(), func, regMap);
    }

    private void visitGet(getInstr get, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(get.ptr, "t0", func, regMap);
        if (get.idx.size() > 1)
            getReg(get.idx.get(1), "t1", func, regMap);
        else getReg(get.idx.get(0), "t1", func, regMap);
        func.curBlock.instrs.addAll(Imm("sll", "t1", "t1", 2));
        ArithInstr ar = new ArithInstr();
        ar.opType = "add";
        ar.rd = "t2";
        ar.rs1 = "t0";
        ar.rs2 = "t1";
        func.curBlock.instrs.add(ar);
        storeReg("t2", get.result.getString(), func, regMap);
    }

    private void visitIcmp(icmpInstr icmp, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(icmp.op1, "t1", func, regMap);
        getReg(icmp.op2, "t2", func, regMap);
        switch (icmp.cond) {
            case eq -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "xor";
                ar1.rd = "t3";
                ar1.rs1 = "t1";
                ar1.rs2 = "t2";
                func.curBlock.instrs.add(ar1);
                ImmInstr ar2 = new ImmInstr();
                ar2.opType = "sltiu";
                ar2.rd = "t0";
                ar2.rs = "t3";
                ar2.imm = 1;
                func.curBlock.instrs.add(ar2);
            }
            case ne -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "xor";
                ar1.rd = "t3";
                ar1.rs1 = "t1";
                ar1.rs2 = "t2";
                func.curBlock.instrs.add(ar1);
                ImmInstr ar2 = new ImmInstr();
                ar2.opType = "sltiu";
                ar2.rd = "t3";
                ar2.rs = "t3";
                ar2.imm = 1;
                func.curBlock.instrs.add(ar2);
                ImmInstr ar3 = new ImmInstr();
                ar3.opType = "xori";
                ar3.rd = "t0";
                ar3.rs = "t3";
                ar3.imm = 1;
                func.curBlock.instrs.add(ar3);
            }
            case sgt -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "slt";
                ar1.rd = "t0";
                ar1.rs1 = "t2";
                ar1.rs2 = "t1";
                func.curBlock.instrs.add(ar1);
            }
            case sge -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "slt";
                ar1.rd = "t0";
                ar1.rs1 = "t1";
                ar1.rs2 = "t2";
                func.curBlock.instrs.add(ar1);
                ImmInstr ar2 = new ImmInstr();
                ar2.opType = "xori";
                ar2.rd = "t0";
                ar2.rs = "t0";
                ar2.imm = 1;
                func.curBlock.instrs.add(ar2);
            }
            case slt -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "slt";
                ar1.rd = "t0";
                ar1.rs1 = "t1";
                ar1.rs2 = "t2";
                func.curBlock.instrs.add(ar1);
            }
            case sle -> {
                ArithInstr ar1 = new ArithInstr();
                ar1.opType = "slt";
                ar1.rd = "t0";
                ar1.rs1 = "t2";
                ar1.rs2 = "t1";
                func.curBlock.instrs.add(ar1);
                ImmInstr ar2 = new ImmInstr();
                ar2.opType = "xori";
                ar2.rd = "t0";
                ar2.rs = "t0";
                ar2.imm = 1;
                func.curBlock.instrs.add(ar2);
            }
        }
        storeReg("t0", icmp.result.getString(), func, regMap);
    }

    private void visitSelect(selectInstr select, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(select.cond, "t0", func, regMap);
        getReg(select.val1, "t1", func, regMap);
        getReg(select.val2, "t2", func, regMap);

        // from gpt
        ArithInstr ar1 = new ArithInstr();
        ar1.opType = "sltu";
        ar1.rd = "t3";
        ar1.rs1 = "x0";
        ar1.rs2 = "t0"; // t0 = 1 then > x0
        func.curBlock.instrs.add(ar1);
        UnaryInstr un1 = new UnaryInstr();
        un1.op = "neg";
        un1.rd = "t3";
        un1.rs = "t3";
        func.curBlock.instrs.add(un1); // all 0 or all 1
        ArithInstr ar2 = new ArithInstr();
        ar2.opType = "and";
        ar2.rd = "t4";
        ar2.rs1 = "t1";
        ar2.rs2 = "t3";
        func.curBlock.instrs.add(ar2);
        UnaryInstr un2 = new UnaryInstr();
        un2.op = "not";
        un2.rd = "t3";
        un2.rs = "t3";
        func.curBlock.instrs.add(un2);
        ArithInstr ar3 = new ArithInstr();
        ar3.opType = "and";
        ar3.rd = "t5";
        ar3.rs1 = "t2";
        ar3.rs2 = "t3";
        func.curBlock.instrs.add(ar3);
        ArithInstr ar4 = new ArithInstr();
        ar4.opType = "or";
        ar4.rd = "t3";
        ar4.rs1 = "t4";
        ar4.rs2 = "t5";
        func.curBlock.instrs.add(ar4);

        storeReg("t3", select.result.getString(), func, regMap);
    }

    private void visitRet(retInstr ret, ASMFunction func, HashMap<String, Integer> regMap) {
        if (ret.type != null) {
            getReg(ret.value, "a0", func, regMap);
        }
        func.curBlock.instrs.addAll(Lw("ra", 0, "sp"));
        func.curBlock.instrs.addAll(Imm("add", "sp", "sp", func.spOffset));
        Directive r = new Directive();
        r.dir = "ret";
        func.curBlock.instrs.add(r);
    }

    private void visitLoad(loadInstr load, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(load.pointer, "t0", func, regMap);
        LwInstr lw = new LwInstr();
        lw.dest = "t1";
        lw.offset = 0;
        lw.base = "t0";
        func.curBlock.instrs.add(lw);
        storeReg("t1", load.result.getString(), func, regMap);
    }

    private void visitStore(storeInstr store, ASMFunction func, HashMap<String, Integer> regMap) {
        getReg(store.value, "t0", func, regMap);
        getReg(store.ptr, "t1", func, regMap);
        func.curBlock.instrs.addAll(Sw("t0", 0, "t1"));
    }

    private void visitMove(moveInstr move, ASMFunction func, HashMap<String, Integer> regMap) {
        String temp_reg;
        if (regMap.containsKey(move.val.getString())) {
            temp_reg = physicName(regMap.get(move.val.getString()));
        }
        else {
            getReg(move.val, "t0", func, regMap);
            temp_reg = "t0";
        }

        if (regMap.containsKey(move.dest.getString())) {
            String rd = physicName(regMap.get(move.dest.getString()));
            MvInstr mv = new MvInstr();
            mv.rd = rd;
            mv.rs = temp_reg;
            func.curBlock.instrs.add(mv);
        }
        else {
            if (move.dest.getString().startsWith("@")) {
                LaInstr la = new LaInstr();
                la.rd = "t1";
                la.label = move.dest.getString().substring(1);
                func.curBlock.instrs.add(la);
                SwInstr sw = new SwInstr();
                sw.src = temp_reg;
                sw.dest = "t1";
                sw.offset = 0;
                func.curBlock.instrs.add(sw);
            }
            else {
                int offset = func.getVirtualReg(move.dest.getString());
                func.curBlock.instrs.addAll(Sw(temp_reg, offset, "sp"));
            }
        }
    }

    public String getString() {
        return textSection.getString() +
                dataSection.getString() +
                roDataSection.getString();
    }
}
