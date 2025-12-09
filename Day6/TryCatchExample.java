package Day6;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Cannot divide by zero!");
            System.err.println("Exception details: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
            System.err.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after the try-catch block.");
    }
}
