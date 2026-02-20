package Arrays;

import java.util.Scanner;

public class ceilFloorProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Enter elements to search: ");
        int k = input.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int ceil = 0;
        int floor = 0;
        while (l <= h) {
            int m = (l + h) / 2;
            if (k < arr[m]) {
                h = m - 1;
                ceil = arr[m];

            } else if (k > arr[m]) {
                l = m + 1;
                floor = arr[m];
            } else {
                ceil=arr[m];
                floor = arr[m];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
