package Arrays;

import java.util.Scanner;

public class subArrOfArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int arr[] = new int[n];
        for (int i=0;i< arr.length;i++){
                arr[i] = input.nextInt();
        }
        System.out.println("Sub arrays are:");
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.println(arr[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
