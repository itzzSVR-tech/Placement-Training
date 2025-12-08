

import java.util.Scanner;

public class MajorityElement {

    public static int findMajorityElement(int[] arr) {
        int number = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                number = num;
            }
            count += (num == number) ? 1 : -1;
        }

        count = 0;
        for (int num : arr) {
            if (num == number) {
                count++;
            }
        }

        return (count > arr.length / 2) ? number : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int majorityElement = findMajorityElement(arr);

        if (majorityElement != -1) {
            System.out.println("Majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found");
        }

        scanner.close();
    }
}
