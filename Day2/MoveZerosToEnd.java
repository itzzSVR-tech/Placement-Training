

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

    public static void moveZeros(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int nonZeroPointer = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, place it at nonZeroPointer
                nums[nonZeroPointer] = nums[i];
                nonZeroPointer++;
            }
        }

        while (nonZeroPointer < nums.length) {
            nums[nonZeroPointer] = 0;
            nonZeroPointer++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));

        sc.close();

    }
}