import java.util.Scanner;

public class MangoTreeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter No. of Cols: ");
        int c = sc.nextInt();
        System.out.print("Enter No. to Check: ");
        int n = sc.nextInt();

        if (n <= c || n % c == 1 || n % c == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
