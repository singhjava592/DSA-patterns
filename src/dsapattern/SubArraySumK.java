package dsapattern;

import java.util.HashMap;

public class SubArraySumK {

    public static int subArraySunK(int []arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int  sum = 0;
        int count = 0;

        for (int num : arr){
            sum = sum + num;
            if(map.containsKey(sum - k)){
                count = count + map.get(sum -k);
            }
            map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 6;
        System.out.println(subArraySunK(arr,k));
    }
}
