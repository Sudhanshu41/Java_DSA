package Sorting;

import java.util.Scanner;

public class Selection_Sorting {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<=nums.length-2;i++){
            int min = i;
            for(int j=i;j<=nums.length-1;j++){
                if(nums[j]<nums[min]){
                    int temp = nums[min];
                    nums[min] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int [] res = nums;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i =0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Sorted array is: ");
        Selection_Sorting obj = new Selection_Sorting();
        for (int num : obj.sortArray(arr)) {
            System.out.println(num);
        }

    }
}
