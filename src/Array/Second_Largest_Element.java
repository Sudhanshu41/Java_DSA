package Array;

import java.util.Scanner;

public class Second_Largest_Element {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax = -1;
        for (int i = 0; i < arr.length; i++) {
            if (smax < arr[i] && arr[i] != max) {
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Second_Largest_Element obj = new Second_Largest_Element();
        int res = obj.getSecondLargest(arr);
        System.out.println(res);
    }
}


