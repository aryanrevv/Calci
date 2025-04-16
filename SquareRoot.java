public class SquareRoot {
    public static double squareRoot(double a) {
        try {
            if (a < 0) {
                throw new IllegalArgumentException("Cannot compute square root of a negative number.");
            }
            return Math.sqrt(a);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }
}
