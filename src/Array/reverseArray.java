package Array;

import java.util.Scanner;

public class reverseArray {
    static void reverse(int [] arr){
       int i=0;
       int j= arr.length-1;
       while(i<j){
           int temp = arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
    }
    static void display(int [] arr){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }

        reverse(arr);
        display(arr);
    }
}
