package Array;

import java.util.Scanner;

public class exitPoitnOfMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows and columns of the matrix");
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println("Enter the elements: ");
        int [][] arr= new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[0].length;j++ ){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Finding the exit point");
        int dir =0;// 0 stands for east ,1 stands for South, 2 stands for west, 3 stands for North
        int i=0;
        int j =0;

        while (i>=0 && j>=0 && i< arr.length && j<arr[0].length){
            dir = (dir +arr[i][j])%4;
            if (dir==0){
                j++;
            } else if (dir==1) {
                i++;
            } else if (dir == 2) {
                j--;
            }else if (dir == 3){
                i--;
            }
            if (i<0){

                System.out.println("Row: "+(i+1)+" Column: "+j);
                break;
            } else if (j<0) {
                System.out.println("Row: "+(j+1)+" Column: "+i);
                break;
            } else if (i== arr.length) {
                System.out.println("Row: "+(i)+" Column: "+j);
                break;
            } else if (j==arr[0].length) {
                System.out.println("Row: "+(i)+"\n Column: "+j);
                break;
            }


        }

    }
}
