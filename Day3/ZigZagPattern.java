package Day3;

import java.util.Scanner;

public class ZigZagPattern {
    /*
     * for (int i = 0; i < r; i++) {
     *     for (int j = 0; j < i; j++) {
     *          if (i==0)||(i==r-1)||(i+j==n-1) {
     *              s += a[i][j]
     *          }
     *     }
     * }
     */
    public static int[][] getArray(int a, int b) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[a][b];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("Enter element at [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    public static void main(String[] args) {
        
    }
}
