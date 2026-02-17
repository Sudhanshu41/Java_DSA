package basics.numberSystem;

import java.util.Scanner;

public class twoBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int k1 = input.nextInt();
        int k2 = input.nextInt();
        int s = Solution(n,k,k1,k2);
        System.out.println(s);
    }
    public static int Solution(int n,int k,int k1,int k2){
        int rv=0;
        int p=1;
        while (n>0){
            int dig=n%k1;
            n=n/k1;
            rv+=dig*p;
            p=p*k;
        }
        int pv=0;
        int p1=1;
        while (rv>0){
            int dig2 = rv%k2;
            rv=rv/k2;
            pv+=dig2*p1;
            p1=p1*k1;
        }
        return pv;

    }
}
