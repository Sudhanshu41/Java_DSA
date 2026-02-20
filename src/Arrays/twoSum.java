package Arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = input.nextInt();
        int [] arr= new int[n] ;
        for (int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        int target;
        System.out.println("Enter the sum u wan to find for:");
        target = input.nextInt();
        int [] result = twoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }

        public static int[] twoSum(int[] nums, int target) {

            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int []{-1,-1};
        }
    }

