package twopointers;

import java.util.*;

public class TwoSumUnsorted {

    public static List<List<Integer>> twoSum(int [] nums, int target){
        Set<Integer> seen = new HashSet<>();
        Set<String> unique = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int num : nums){
            int complement = target - num;

            if(seen.contains(complement)){
                int a = Math.min(num,complement);
                int b  = Math.max(num,complement);
                String key = a + "-"+ b;

                if(!unique.contains(key)){
                    result.add(Arrays.asList(a,b));
                    unique.add(key);
                }
            }

            seen.add(num);
        }
        return result;
    }
}

// time  -O(n)
// space  O(n)  --> order is preserved .
