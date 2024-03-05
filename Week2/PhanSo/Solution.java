package Week2.PhanSo;
/**
 * Lớp đại diện cho một phân số (tử số/mẫu số).
 */
public class Solution {
    private int numerator;   // Tử số
    private int denominator; // Mẫu số

    /**
     * Constructor mặc định.
     * Tạo một đối tượng Solution với giá trị tử số = 1 và mẫu số = 1.
     */
    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Constructor.
     * Tạo một đối tượng Solution với tử số và mẫu số được cung cấp.
     * Nếu mẫu số là 0, tử số được giữ nguyên và mẫu số được đặt thành 1.
     *
     * @param numerator   tử số
     * @param denominator mẫu số
     */
    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * Setter cho tử số.
     *
     * @param numerator tử số mới
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Getter cho tử số.
     *
     * @return tử số
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Setter cho mẫu số.
     * Nếu mẫu số là 0, mẫu số được giữ nguyên.
     *
     * @param denominator mẫu số mới
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Getter cho mẫu số.
     *
     * @return mẫu số
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Tìm ước chung lớn nhất của hai số.
     *
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return ước chung lớn nhất
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Rút gọn phân số về dạng tối giản.
     *
     * @return phân số rút gọn
     */
    public Solution reduce() {
        int temp = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / temp);
        this.setDenominator(this.getDenominator() / temp);
        return this;
    }

    /**
     * Cộng hai phân số.
     *
     * @param fraction phân số cần cộng
     * @return phân số tổng
     */
    public Solution add(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator
                + fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Trừ hai phân số.
     *
     * @param fraction phân số cần trừ
     * @return phân số hiệu
     */
    public Solution subtract(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator
                - fraction.numerator * this.denominator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Nhân hai phân số.
     *
     * @param fraction phân số cần nhân
     * @return phân số tích
     */
    public Solution multiply(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.numerator;
        int newDenominator = this.denominator * fraction.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * Chia hai phân số.
     *
     * @param fraction phân số cần chia
     * @return phân số thương
     */
    public Solution divide(Solution fraction) {
        fraction.reduce();
        int newNumerator = this.numerator * fraction.denominator;
        int newDenominator = this.denominator * fraction.numerator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    /**
     * So sánh hai phân số xem chúng có bằng nhau hay không.
     *
     * @param obj đối tượng để so sánh
     * @return true nếu bằng nhau, ngược lại trả về false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            this.reduce();
            if (other.getNumerator() == this.getNumerator()) {
                return other.getDenominator() == this.getDenominator();
            }
        }
        return false;
    }
}