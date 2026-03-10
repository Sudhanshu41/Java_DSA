package Array;

import java.util.Scanner;

public class inverseOfAnArray {
    public static int [] inverse(int [] arr){
        int [] inv = new int[arr.length];
        for (int i=0;i< arr.length;i++){
            int v= arr[i];
            inv[v]=i;// remember in this question if you are taking input of 5 integers in array then array vaue can be only 0 to 4 means 0 to arr.length-1;
        }

         return inv;
    }
    static void display(int [] arr){

        for (int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int [] arr = new int[n];
        for (int i=0;i< arr.length;i++){
            arr[i] = input.nextInt();
        }
       int [] res = inverse(arr);
        display(res);

    }
}
