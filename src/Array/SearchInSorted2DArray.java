package Array;

import java.util.Scanner;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the Number you want to search: ");
        int s = scn.nextInt();
        int i=0;
        int j = m-1;
        while (i<n && j>=0) {
            if (arr[i][j] == s) {
                System.out.printf("Found at %d %d", i, j);
                return;
            } else if (arr[i][j] > s) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("not found");
    }
}
