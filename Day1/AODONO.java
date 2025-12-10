import java.util.Scanner;

public class AODONO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("AO");
        } else if (a > b && b > c) {
            System.out.println("DO");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
