public class Main8 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = dividend / divisor; // Attempting to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
