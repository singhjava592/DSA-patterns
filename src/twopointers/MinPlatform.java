package twopointers;

import java.util.Arrays;

public class MinPlatform {

    public static int findPlatform(int [] arr, int [] dep){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0;
        int j = 0;
        int platform = 0;
        int maxPlatform = 0;

        while(i < arr.length && j < dep.length){
            if(arr[i] <= dep[j]){
                platform ++;
                maxPlatform = Math.max(maxPlatform,platform);
                i ++;
            }else{
                platform --;
                j ++;
            }
        }
        return maxPlatform;

    }

    public static void main(String[] args) {
        int [] arr = {900,940,950,1100,1500,1800};
        int [] dep = {910,1200,1120,1130,1900,2000};

        System.out.println(findPlatform(arr,dep));
    }
}
