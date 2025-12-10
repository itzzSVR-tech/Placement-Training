import java.util.Scanner;

public class SecondLargestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int in = 0;

        if ((a > b && a < c) || (a < b && a > c)) {
            in = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            in = b;
        } else {
            in = c;
        }
        
        System.out.println(in);
        sc.close();
    }
}
