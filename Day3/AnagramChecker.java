

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        String s1Clean = str1.replaceAll("\\s", "").toLowerCase();
        String s2Clean = str2.replaceAll("\\s", "").toLowerCase();

        if (s1Clean.length() != s2Clean.length()) {
            return false;
        }

        char[] charArray1 = s1Clean.toCharArray();
        char[] charArray2 = s2Clean.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();

        System.out.println("Checking '" + str1 + "' and '" + str2 + "': "
                + (isAnagram(str1, str2) ? "Yes, Anagrams" : "No, Not Anagrams"));

        sc.close();
    }
}
