package Day2;
public class Operator {
    public static void main(String[] args) {
        int a = 7;
        int result = (a++) + (a++) + (a++) + (--a) + (a--);
        // System.out.println((a++));
        // System.out.println((a++));
        // System.out.println((a++));
        // System.out.println((--a));
        // System.out.println((a--));
        System.out.println("Result: " + result);
        System.out.println("'a' value after expression: " + a);
    }
}
