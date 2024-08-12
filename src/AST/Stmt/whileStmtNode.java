package AST.Stmt;

import AST.ASTVisitor;
import AST.Expr.ExprNode;
import util.position;

public class whileStmtNode extends StmtNode{
    public ExprNode condition;
    public StmtNode body;

    public whileStmtNode(ExprNode condition, StmtNode body, position pos) {
        super(pos);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
