package Day9;

import java.util.Scanner;
import java.util.Stack;

public class PostfixCalculator {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid Expression");
                }

                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val2 + val1);
                        break;
                    case "-":
                        stack.push(val2 - val1);
                        break;
                    case "/":
                        stack.push(val2 / val1);
                        break;
                    case "*":
                        stack.push(val2 * val1);
                        break;
                }
            } else {
                try {
                    stack.push(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid token found: " + token);
                    return -1;
                }
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Postfix Calculator ---");
        System.out.println("Enter a postfix expression (separate numbers and operators with spaces):");
        System.out.println("Example: 10 2 + 3 *");

        System.out.print("Input: ");
        String input = scanner.nextLine();

        try {
            int result = evaluatePostfix(input);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}