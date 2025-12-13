package Day9;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expr) {
        if (expr == null || expr.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);

            if (current == '(' || current == '{' || current == '[') { stack.push(current); } 
            else if (current == ')' || current == '}' || current == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpened = stack.pop();

                if (!isMatchingPair(lastOpened, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Input: ");
        String input = sc.nextLine();

        System.out.println("Input: " + input + " -> " + (isBalanced(input) ? "Balanced" : "Not Balanced"));

        sc.close();
    }
}