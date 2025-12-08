import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");
        String ip = sc.nextLine();

        System.out.println("Original: " + ip);
        System.out.println("Reversed: " + reverseWords(ip));

        sc.close();
    }

    public static String reverseWords(String ip) {
        if (ip == null || ip.length() == 0) {
            return "";
        }

        String[] words = ip.trim().split("\\s+");
        
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];

            if (i > 0) {
                result += " ";
            }
        }

        return result;
    }
}
