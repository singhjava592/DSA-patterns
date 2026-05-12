package twopointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubsStringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s){

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLenght = 0;

        for(int right  = 0; right < s.length(); right ++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left)); // SHrinking
                left ++;
            }
            set.add(s.charAt(right));
            maxLenght = Math.max(maxLenght,right -left +1);
        }
        return  maxLenght;
    }
}
