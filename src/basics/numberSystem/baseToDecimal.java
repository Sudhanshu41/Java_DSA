package basics.numberSystem;

import java.util.Scanner;

public class baseToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();;
        int k = input.nextInt();
        int s = Solution(n,k);
        System.out.println(s);
    }
    public static int Solution(int n,int k){
        int rv=0;
        int p=1;
        while (n>0){
            int dig = n%10;
            n=n/10;
            rv+=dig*p;
            p=p*k;
        }
        return rv;
    }
}
