import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word);
            reverseWord.reverse();

            result.append(reverseWord).append(" ");
        }

        System.out.println("Reversed Words: " + result.toString().trim());

        scanner.close();
    }
}
