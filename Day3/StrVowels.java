

import java.util.Scanner;

public class StrVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String lowerStr = str.toLowerCase();

        String s = "aeiou";

        int vowelCount = 0;

        for (char ch: lowerStr.toCharArray()) {

            if (s.indexOf(ch) != -1) {
                vowelCount++;
            }
        }

        System.out.println("The No. of Vowels in the given String " + str + " is: " + vowelCount);

        sc.close();
    }
}
