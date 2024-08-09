package AST;

import util.position;

abstract public class ASTNode {
    private position pos;

    public ASTNode(position pos) {
        this.pos = pos;
    }

    abstract public void accept(ASTVisitor visitor);
}
