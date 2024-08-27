package IR;

import IR.Instruction.Instr;
import IR.Instruction.callInstr;
import IR.Instruction.label;

public class mainFn extends block {
    public mainFn() {
        callInstr c = new callInstr();
        c.methodName = "_init";
        instrs.add(c);
    }

    @Override
    public String getString() {
        StringBuilder s = new StringBuilder("define i32 @main() {\nentry:\n");
        for(Instr i : instrs) {
            if (!(i instanceof label)) {
                s.append("  ");
            }
            s.append(i.getString()).append("\n");
        }
        s.append("}");
        return s.toString();
    }
}