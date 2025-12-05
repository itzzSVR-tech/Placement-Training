package Day2;

public class LinearSearch {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int targetValue = 30;
        int index = findElement(numbers, targetValue);

        if (index != -1) {
            System.out.println("Element " + targetValue + " found at index " + index);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }
}
