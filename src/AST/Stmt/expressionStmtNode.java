package AST.Stmt;

import AST.ASTVisitor;
import AST.Expr.ExprNode;
import util.position;

public class expressionStmtNode extends StmtNode{
    public ExprNode expression;

    public expressionStmtNode(ExprNode expression, position pos) {
        super(pos);
        this.expression = expression;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
