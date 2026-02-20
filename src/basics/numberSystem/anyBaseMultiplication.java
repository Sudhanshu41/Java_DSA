package basics.numberSystem;

import java.util.Scanner;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        int n1 = input.nextInt();
        int n2= input.nextInt();
        int s = Solution(b,n1,n2);
        System.out.println(s);
    }
    public static int Solution(int b,int n1,int n2){
        int rv=0;
        int p=1;
        while(n2>0){
            int d2 = n2%10;
            n2=n2/10;
            int m1 = multiplyWithSingleDigit(b,n1,d2);
            rv =add(b,rv,m1*p);
            p=p*10;
        }

        return rv;
    }
    public static int add(int b,int n1,int n2){
        int rv =0;
        int c=0;
        int p=1;
        while(n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1=n1/10;
            n2=n2/10;
            int d = d1+d2+c;
            c = d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;

        }
        return rv;
    }
    public static int multiplyWithSingleDigit(int b,int n1,int d2){
        int rv =0;
        int c=0;
        int p=1;
        while (n1>0 || c>0){
            int d1 = n1%10;
            n1 =  n1/10;

            int d = d1*d2+c;
            c=d/b;
            d=d%b;

            rv = rv+d*p;
            p=p*10;
        }
        return rv;
    }
}
