package AST.Expr;

import AST.ASTVisitor;
import util.position;

public class assignExprNode extends ExprNode{
    public ExprNode lhs, rhs;

    public assignExprNode(position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
