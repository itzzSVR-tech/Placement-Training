package Day3;

import java.util.Scanner;

public class ColSumCalculator {

    public static int ColSum(int rows, int cols, int[][] mat) {
        System.out.println("\n--- Results ---");
        int colSum = 0;
        for (int j = 0; j < cols; j++) {
  
            for (int i = 0; i < rows; i++) {
                colSum += mat[i][j];
            }
  
            System.out.println("Sum of Column " + (j + 1) + ": " + colSum);
            colSum = 0;
        }

        return colSum;
    }

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = getArray(rows, cols);

        int res = ColSum(rows, cols, arr);

        sc.close();
    }
}