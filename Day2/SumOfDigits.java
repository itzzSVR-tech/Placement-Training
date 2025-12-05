package Day2;

import java.util.Scanner;

public class SumOfDigits {
    public static int singleDigitSum(int num) {
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number: ");
        int num = sc.nextInt();

        System.out.println("The sum of the digits is: " + singleDigitSum(num));

        sc.close();
    }
}
