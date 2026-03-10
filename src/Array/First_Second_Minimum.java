package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class First_Second_Minimum {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        Arrays.sort(arr);
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int smin =-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>min){
                smin = arr[i];
                break;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(smin==-1){
            ans.add(-1);
        }else{
            ans.add(min);
            ans.add(smin);
        }


        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        First_Second_Minimum obj = new First_Second_Minimum();
        ArrayList<Integer> res = new ArrayList<>();
        res = obj.minAnd2ndMin(arr);
        System.out.println(res);
    }
}
