package Arrays;

import java.util.Scanner;

public class SubOfTwoArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();

        int [] a1= new int[n1];
        for (int i=0;i< a1.length;i++){
            a1[i]= scn.nextInt();
        }
        int n2 = scn.nextInt();
        int [] a2= new int[n2];
        for (int i=0;i< a2.length;i++){
            a2[i]= scn.nextInt();
        }
        int [] sub = new int[n2];
        int c=0;
        int i= a1.length-1;
        int j = a2.length-1;
        int k= sub.length-1;
        while (k>=0){
            int d=0;
            int alv = i>=0?a1[i]:0;
            if (a2[j]+c>=alv){
                d = a2[j]+c-alv;
            }else {
                d=a2[j]+c+10-alv;
                c=-1;
            }
            sub[k]=d;
            i--;
            j--;
            k--;
        }
        int idx =0;
        while(idx<sub.length){
            if (sub[idx]==0){
                idx++;
            }
            else {
                break;
            }
        }
       while (idx< sub.length){
           System.out.println(sub[idx]);
           idx++;
       }
    }
}
