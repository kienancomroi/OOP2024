package Week3.JUnit;

/**
 * tinh toan BMI
 */
public class Week4 {
    /**
     * @param a la so thu 1
     * @param b la so thu 2
     * @return so lon nhat trong 2 so
     */
    public static int max2Int (int a, int b) {
        return a > b ? a : b ;
    }

    /**
     * tim gia tri nho nhat cua mang
     * @param array so
     * @return so luong toi thieu cua mang
     */
    public static int minArray ( int[] array) {
        int min = array [0];
        for ( int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * @param weight kg
     * @param heigh m
     * @return BMI
     */
    public static String calculateBMI ( double weight, double heigh) {
        double BMI = weight / ( heigh * heigh );
        BMI = Math.round (bmi * 10) / 10.0;
        if ( BMI < 18.5 ) {
            return " Thiếu cân " ;
        } else if ( BMI > 18.5 && BMI < 22.9 ) {
            return " Bình thường " ;
        } else if ( BMI > 23 && BMI < 24.9 ) {
            return " Thừa cân " ;
        } else if ( BMI > 25 ) {
            return " Béo phì " ;
        }
        return "" ;
    }

}
