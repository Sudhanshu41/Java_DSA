package Sorting;

public class Recursive_Bubble_Sort {
    static void bs(int [] arr , int n){
        if(n==1){
            return;
        }
        for (int i = 0; i <=n-2 ; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bs(arr,n-1);
    }

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("before using bs");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        bs(arr,n);
        System.out.println("After using Bs");
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
