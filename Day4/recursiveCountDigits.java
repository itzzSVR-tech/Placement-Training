package Day4;

import java.util.Scanner;

public class recursiveCountDigits {

    static int countDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = countDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + result);

        sc.close();
    }
}
