package Week5.NgoaiLe1;

public class Multiplication extends BinaryExpression {

    /**
     * Constructor for Multiplication.
     * @param left the left expression
     * @param right the right expression
     */

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Evaluates the expression.
     * @return the result of the expression
     */

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }

    /**
     * Return a string representation of the expression.
     * @return the string representation
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}