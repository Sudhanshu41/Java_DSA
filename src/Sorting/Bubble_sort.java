package Sorting;

import java.util.Scanner;

public class Bubble_sort {
    public void bubbleSort(int[] arr) {

        for(int i =arr.length-1;i>=0;i--){
            int didswap =0;
            for(int j =0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap=1;
                }
            }
            if (didswap==0){
                break;
            }
        }
    }


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = input.nextInt();
    }
    System.out.println("Sorted array is: ");
    Bubble_sort obj = new Bubble_sort();
    obj.bubbleSort(arr);
    for (int num: arr){
        System.out.println(arr);
    }



}
}
