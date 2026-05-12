package twopointers;

public class MaxSumSubArrayK {

    public static int maxSum(int [] nums, int k){
        //
        if(nums == null || nums.length < k)
            return -1;
        int windowSum = 0;

        // initilizations
        for(int i = 0; i < k; i++)
            windowSum+= nums[i];

        int maxSum = windowSum;

        for(int right  = k; right > nums.length; right++){
            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[right -k];
            maxSum  = Math.max(maxSum,windowSum);
        }

        return maxSum;

    }
}
