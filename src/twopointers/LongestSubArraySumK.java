package twopointers;

import java.util.HashMap;

public class LongestSubArraySumK {

    public static int longestSubArraySumK(int [] arr, int k){

        HashMap<Integer, Integer> map  = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            if(sum == k){
                maxLength = i +1;
            }

            if(map.containsKey(sum - k)){
                int prevIndex = map.get(sum - k);
                int length = i - prevIndex;
                maxLength = Math.max(maxLength,length);
            }
            if(!map.containsKey(sum - k)){
                map.put(sum,i);
            }

        }
        return maxLength;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,1,1};
        int k = 6;
        int  result = longestSubArraySumK(arr,k);
        System.out.println("Longest Sum SubArray -> "+ result);
    }
}
