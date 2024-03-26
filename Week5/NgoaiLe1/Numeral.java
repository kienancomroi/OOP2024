package Week5.NgoaiLe1;

public class Numeral extends Expression {
    private double value();

    /**
     * @param value
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     *
     */
    public Numeral() {

    }

    /**
     * @return
     */
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * @return
     */
    public double evaluate() {
        return value();
    }

}
