package basics.numberSystem;

import java.util.Scanner;

public class decimalToAnyBase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // decimal number
        int k = input.nextInt(); // base

        int[] res = sumBase(n, k);

        System.out.println("Converted number = " + res[0]);
        System.out.println("Sum of digits = " + res[1]);

        input.close();
    }

    public static int[] sumBase(int n, int k) {
        int rv = 0;
        int p = 1;

        // 🔹 decimal → any base
        while (n > 0) {
            int dig = n % k;
            n = n / k;
            rv += dig * p;
            p = p * 10;
        }

        // 🔹 sum of digits
        int sum = 0;
        int temp = rv;

        while (temp > 0) {
            int dig1 = temp % 10;
            temp = temp / 10;
            sum += dig1;
        }

        return new int[]{rv, sum};
    }
}
