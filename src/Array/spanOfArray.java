package Array;

import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = input.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }
        int result = Solution(arr);
        System.out.println(result);
    }
    public static int Solution (int [] arr ){
            int max = arr[0];
            int min = arr[0];
            for (int i=1;i<arr.length;i++){
                if (arr[i]>max){
                    max = arr[i];
                }
            }
            for (int i=1;i< arr.length;i++){
                if (arr[i]<min){
                    min = arr[i];
                }
            }
            return max -min;
    }
}
