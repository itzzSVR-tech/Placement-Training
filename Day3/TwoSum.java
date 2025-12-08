

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 6 };
        int target = 6;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);

        findPair(numbers, target);
    }

    public static void findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == target) {
                System.out.println("Success! Found pair: [" + arr[left] + ", " + arr[right] + "]");
                System.out.println("Indices: " + left + " and " + right);
                found = true;

                break;
            }

            else if (currentSum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found that sums to " + target);
        }
    }
}
