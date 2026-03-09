package Sorting;

public class Recursive_Insertion_Sort {
static void ris(int [] arr,int i,int n){
    if(i==n){
        return ;
    }
    int j=i;
    while (j>0 && arr[j-1]>arr[j]){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
        j--;
    }
    ris(arr,i+1,n);
}

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        int n = arr.length;
        System.out.println("before using ris");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        ris(arr,0,n);
        System.out.println("After using ris");
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }
}
