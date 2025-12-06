package Day4;

import java.util.Scanner;

public class recursiveFibonaaci {
    static int Fib(int N) {
        if (N == 0 || N == 1)
            return N;

        return Fib(N - 1) + Fib(N - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.print("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Fibonacci of " + num + " is: " + Fib(num));

        sc.close();
    }

}