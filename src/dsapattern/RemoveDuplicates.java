package dsapattern;

public class RemoveDuplicates {

    public static int removeDuplicates(int [] nums){
        if(nums.length == 0) return 0;
        int left = 0;
        for(int right  = 1; right < nums.length; right ++){
            if(nums[right] != nums[left]){
                left ++;
                nums[left] = nums[right];
            }
        }

        return left + 1;
    }
}

//Time  --> O(n)
///  space  O (1).
