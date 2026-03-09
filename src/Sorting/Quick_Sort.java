package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    void qs(int [] arr,int low,int high){
        if (low<high){
            int pIndex = function(arr, low, high);
            qs(arr,low,pIndex-1);
            qs(arr,pIndex+1,high);
        }
    }
    int function(int [] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j =high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }
            if (i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] =temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Sorted array is: ");
        Quick_Sort obj = new Quick_Sort();
        obj.qs(arr,0, arr.length-1);

            System.out.print(Arrays.toString(arr));

    }
}
