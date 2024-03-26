package Week5.NgoaiLe1
public class Numeral extends Expression {
    private double value;

    /**
     * constructor for class numeral.
     * @param value the value numeral
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * constructor for numeral.
     */
    public Numeral() {

    }

    /**
     * Override the toString method numeral.
     * @return the value numeral
     */

    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * Override the evaluate method numeral.
     * @return the value numeral
     */
    public double evaluate() {
        return value;
    }

}
