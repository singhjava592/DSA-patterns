package twopointers;

import javax.swing.*;

public class PrefixSum {
    public static int rangeSum(int [] prefix, int L, int R){
        if(L == 0){
            return prefix[R];
        }
        return prefix[R] - prefix[L-1];
    }

    public static void main(String[] args) {
        int [] arr = {3,1,4,2,5};
        int [] prefix = new int[arr.length];
         prefix [0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] +arr[i];
        }

        System.out.println(rangeSum(prefix,1,3));

        System.out.println(rangeSum(prefix,0,2));
    }
}

//step-1 O(n)

// fethc range sum query  -- O(1)
