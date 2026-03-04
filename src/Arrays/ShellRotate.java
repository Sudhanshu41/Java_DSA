package Arrays;

import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length ; i++) {
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter shell want to rotate");
        int s = input.nextInt();
        System.out.println("Enter the number of rotation");
        int r = input.nextInt();
        rotateShell(arr,s,r);
        display(arr);
    }
    public static void display(int [][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void rotateShell(int [][] arr,int s,int r){
        int [] oned = fillOnedFromShell(arr,s);
        rotate(oned,r);
        fillShellFromOned(arr,s,oned);
    }
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
    public static int [] fillOnedFromShell(int [][] arr,int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int sz = (maxr-minr+1)*2+(maxc-minc+1)*2-4;
        int [] oned = new int[sz];
        //lw
        int idx = 0;
        for (int i=minr,j=minc;i<=maxr;i++){
            oned[idx] =  arr[i][j];
            idx++;
        }
        //bw
        for (int i=maxr,j=minc+1;j<=maxc;j++){
            oned[idx] =  arr[i][j];
            idx++;
        }
        //rw
        for (int i = maxr-1,j=maxc; i >=minr ; i--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        //tw
        for (int i = minr,j=maxc-1; j >=minc+1 ; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;

    }
    public static void fillShellFromOned(int [][] arr,int s,int [] arr1){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;

        //lw
        int idx = 0;
        for (int i=minr,j=minc;i<=maxr;i++){
            arr[i][j] = arr1[idx];
            idx++;
        }
        //bw
        for (int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j] = arr1[idx];
            idx++;
        }
        //rw
        for (int i = maxr-1,j=maxc; i >=minr ; i--) {
            arr[i][j] = arr1[idx];
            idx++;
        }
        //tw
        for (int i = minr,j=maxc-1; j >=minc+1 ; j--) {
            arr[i][j] = arr1[idx];
            idx++;
        }

    }
}
