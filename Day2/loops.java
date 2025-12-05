package Day2;
/* 
    `Loops in Java`
    There are 3 kinds of Loops in Java

    FOR:- used for finite range Looping (if we know the no of iterations needed)
    WHILE:- used for infinite looping 
    DO WHILE:- implements flow control under a certain condition
*/
public class loops {

    public static int fibs(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }

        int prev = a;
        int curr = b;
        int nextTerm = 0;
        for (int i = 3; i <= n; i++) {
            nextTerm = prev + curr;
            prev = curr;
            curr = nextTerm;
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 3;
        int b = 5;

        int res = fibs(n, a, b);
        System.out.println("The " + n + "th Fibonacci number starting with " + a + " and " + b + " is: " + res);
    }
}
