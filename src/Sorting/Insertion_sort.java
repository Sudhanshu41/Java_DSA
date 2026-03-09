package Sorting;

import java.util.Scanner;

public class Insertion_sort {
    public static int [] sort(int [] nums){
        for (int i=1;i< nums.length;i++){
            int j =i-1;
            while(j>=0 && nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] =  temp;

                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }

        for (int nums : sort(arr)) {
            System.out.print(nums);
        }
    }

}
