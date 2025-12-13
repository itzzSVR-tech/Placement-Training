package Day9;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    // Method to return precedence of operators
    // Higher number = higher precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Method to convert Infix to Postfix
    static String convertToPostfix(String expression) {
        String result = "";
        
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result += c;
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (!stack.isEmpty()) { 
                    stack.pop(); 
                }
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Infix to Postfix Converter ---");
        System.out.print("Enter Infix Expression (e.g., A+B*(C^D-E)): ");
        
        String infix = scanner.next();
        
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + convertToPostfix(infix));
        
        scanner.close();
    }
}