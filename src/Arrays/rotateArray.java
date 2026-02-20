package Arrays;

import java.util.Scanner;

public class rotateArray {
    static void reverse(int [] arr,int i,int j){
        int li=i;
        int ri= j;
        while(li<ri){
            int temp = arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
    }
    static void rotate(int [] ar,int k){
        k=k% ar.length;
        if (k<0){
            k=k+ ar.length;
        }
        reverse(ar,0, ar.length-k-1);
        reverse(ar,ar.length-k, ar.length-1);
        reverse(ar,0, ar.length-1);
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
        System.out.println("Enter k");
        int k = input.nextInt();
       rotate(arr,k);
        display(arr);
    }
}
