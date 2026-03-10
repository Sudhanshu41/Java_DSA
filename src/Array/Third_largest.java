package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Third_largest {
    int thirdLargest(int arr[]) {
        // code here\
        Arrays.sort(arr);
        if(arr.length<3){
            return -1;
        }
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Third_largest obj = new Third_largest();
        int res = obj.thirdLargest(arr);
        System.out.println(res);
    }
}
