package Arrays;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 20, 20, 20, 20, 70, 80, 90, 100};

        System.out.println("Enter elements to search: ");
        int k = input.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int li=0;
        while (l <= h) {
            int m = (l + h) / 2;
            if (k < arr[m]) {
                h = m - 1;
            } else if (k > arr[m]) {
                l = m + 1;
            } else {
                 li=m;
                l=m+1;
            }

        }
        System.out.println(li);

    }
}
