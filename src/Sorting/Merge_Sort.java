package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort {


        void mergeSort(int arr[], int low, int high) {
            // code here
            if(low>=high){
                return;
            }
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);

            int k=0;
            int temp[] = new int [high-low+1];
            int left = low;
            int right = mid+1;
            while(left<=mid && right<=high){
                if(arr[left]<arr[right]){
                    temp[k] = arr[left];
                    left++;
                }
                else{
                    temp[k] = arr[right];
                    right++;
                }
                k++;
            }
            while(left<=mid){
                temp[k] = arr[left];
                left++;
                k++;
            }
            while(right<=high){
                temp[k] = arr[right];
                right++;
                k++;
            }
            for (int i = low; i <= high; i++) {
                arr[i] = temp[i - low];
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
        Merge_Sort obj = new Merge_Sort();
        obj.mergeSort(arr,0,arr.length-1);

            System.out.print(" "+ Arrays.toString(arr));


    }
    }

