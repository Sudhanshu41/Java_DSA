package Arrays;

import java.util.Scanner;

public class findingElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n = input.nextInt();
        int [] arr= new int[n] ;
        for (int i=0;i< arr.length;i++){
            arr[i]= input.nextInt();
        }
        int target;
        System.out.println("Enter the number u want to find :");
        target = input.nextInt();
        int [] result = Solution(arr,target);
        System.out.println(result[0]);
    }

    public static int[] Solution(int arr[], int target) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                return new int[]{j};
            }
        }
        return new int[]{-1};
    }
}
