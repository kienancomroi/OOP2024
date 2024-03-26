package Week5.NgoaiLe1
public abstract class BinaryExpression extends Expression {

    protected Expression left;
    protected Expression right;

    /**
     * constructor for BinaryExpression.
     * @param left expression
     * @param right expression
     */

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
