

import java.util.Scanner;

public class ArrayReversal {

    public static int[] getArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();

        int[] arr = new int[s];

        // Take user elements for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = getArray();

        System.out.println("Original Array:");
        printArray(numbers);

        reverseArray(numbers);

        System.out.println("\nReversed Array:");
        printArray(numbers);
    }

    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null.");
            return;
        }

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

}