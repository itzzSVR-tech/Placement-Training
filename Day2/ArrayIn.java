package Day2;

import java.util.Scanner;

public class ArrayIn {

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

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}