package Week5.NgoaiLe1;

import Week5.NgoaiLe1.Expression;

public abstract class BinaryExpression extends Expression {

    protected Expression left;
    protected Expression right;

    /**
     * constructor for BinaryExpression.
     * @param left
     * @param right
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public String toString() {
        return "(" + left.toString() + " " + right.toString() + ")";
    }
}
