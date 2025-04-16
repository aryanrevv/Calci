public class Division {
    public static double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }
}
