

import java.util.Scanner;

public class flowControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
            }
        }

        scanner.close();
    }
}