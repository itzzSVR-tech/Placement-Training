

import java.util.Scanner;

public class recursiveFactorial {
    static int fact(int n) {
        if (n <= 1) // base case
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The Factorial of " + num + " is: " + String.valueOf(fact(num)));

        sc.close();
    }
}
