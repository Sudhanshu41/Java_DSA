package Array;

import java.util.Scanner;

public class matrixMultiplication {

    static void multiplication(int n, int m, int k, int l, int[][] arr, int[][] arr1) {

        if (m != k) {
            System.out.println("Multiplication not possible!!!");
            return;
        }

        int[][] res = new int[n][l];

        // multiplication
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                for (int s = 0; s < m; s++) {
                    res[i][j] += arr[i][s] * arr1[s][j];
                }
            }
        }

        // printing
        System.out.println("Result");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // first matrix
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("2 matrix:");

        // second matrix
        int k = input.nextInt();
        int l = input.nextInt();
        int[][] arr1 = new int[k][l];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                arr1[i][j] = input.nextInt();
            }
        }

        multiplication(n, m, k, l, arr, arr1);
    }
}