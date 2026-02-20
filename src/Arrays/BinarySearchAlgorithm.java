package Arrays;

import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("Enter elements to search: ");
        int k = input.nextInt();
        int l=0;
        int h=arr.length-1;
        while (l<=h){
            int m = (l+h)/2;
            if (k<arr[m]){
                h=m-1;
            }else if(k>arr[m]){
                l=m+1;
            }else {
                System.out.println(m);
                break;
            }
        }
    }
}
