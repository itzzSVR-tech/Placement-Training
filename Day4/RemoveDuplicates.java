package Day4;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (sb.indexOf(String.valueOf(current)) == -1) {
                sb.append(current);
            }
        }

        System.out.println("Original: " + str);
        System.out.println("No Duplicates: " + sb.toString());

        sc.close();
    }
}