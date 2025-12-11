import java.util.LinkedList;
import java.util.Scanner;

public class EvenOddLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter the No. of Elements");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            numbers.add(x);
        }

        System.out.println("Original LinkedList: " + numbers);

        System.out.println("\nEven elements:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + ", ");
            }
        }

        System.out.println("\nOdd elements:");
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + ", ");
            }
        }

        sc.close();
    }
}
