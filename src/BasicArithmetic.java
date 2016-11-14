/**
 * Created by jessedavila on 11/14/16.
 */
public class BasicArithmetic {
    public static void main(String[] args) {
        System.out.println(modulus(10,3));
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

}
