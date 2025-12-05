package Day2;

import java.util.Scanner;

public class EvenOddFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] numbers = new int[s];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            numbers[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Frequency of even numbers: " + evenCount);
        System.out.println("Frequency of odd numbers: " + oddCount);

        sc.close();
    }
}
