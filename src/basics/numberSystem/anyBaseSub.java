package basics.numberSystem;

import java.util.Scanner;

public class anyBaseSub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int b = input.nextInt();
        int s = Solution(n1,n2,b);
        System.out.println(s);
    }
    public static int Solution(int n1, int n2, int b){
        int rv=0;
        int p=1;
        int c=0;
        while (n2>0){
            int d1 = n1%10;
            n1=n1/10;
            int d2 = n2%10;
            n2=n2/10;
            int d =0;
            d2=d2+c;
            if (d2>=d1){
                c=0;
                d = d2-d1;
            }else{
                c= -1;
                d = d2+b-d1;
            }
            rv+=d*p;
            p=p*10;
      }

        return rv;
    }
}
