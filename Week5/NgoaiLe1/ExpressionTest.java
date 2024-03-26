package Week5.NgoaiLe1;

public class ExpressionTest {

    /**
     *  Main method.
     */

    public static void main(String[] args) {
        Numeral numeral10 = new Numeral(10);
        Numeral numeral3 = new Numeral(3);
        Numeral numeral4 = new Numeral(4);
        Numeral numeral0 = new Numeral(0);
        Square square10 = new Square(numeral10);
        Subtraction subtraction1 = new Subtraction(square10, numeral3);
        Multiplication multiplication1 = new Multiplication(numeral4, numeral3);
        Addition addition1 = new Addition(subtraction1, multiplication1);
        Square square = new Square(addition1);
        Division division = new Division(square, numeral0);
        System.out.println(division.evaluate());
        // System.out.println(square.evaluate());
        // System.out.println(square.toString());
    }

}
