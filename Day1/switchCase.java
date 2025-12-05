package Day1;

import java.util.Scanner;

public class switchCase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Number 1: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter Number 2: ");
    double num2 = scanner.nextDouble();
    System.out.print("Enter an operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        System.out.println("Result: " + result);
        break;
      case '-':
        result = num1 - num2;
        System.out.println("Result: " + result);
        break;
      case '*':
        result = num1 * num2;
        System.out.println("Result: " + result);
        break;
      case '/':
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println("Result: " + result);
        } else {
          System.out.println("Error: Cannot divide by zero.");
        }
        break;
      default:
        System.out.println("Error: Invalid operator. Please use +, -, *, or /");
        break;
    }
    scanner.close();
  }
}