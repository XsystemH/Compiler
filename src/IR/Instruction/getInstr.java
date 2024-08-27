package IR.Instruction;

import IR.Expression.Expr;
import IR.Expression.Register.Reg;
import IR.IRType.IRType;

public class getInstr extends Instr{
    public Reg result = null;
    public IRType type = null;
    public Expr ptr = null;
    public Expr idx;

    @Override
    public String getString() {
        return result.getString() + " = getelementptr " + type.getString() + ", ptr " + ptr.getString() + ", i32 " + idx.getString();
    }
}