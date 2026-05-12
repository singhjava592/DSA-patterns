package twopointers;

import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {

    public static int countAnagrams(String s, String p){
        Map<Character , Integer> need = new HashMap<>();
        Map<Character , Integer> window = new HashMap<>();

        for(char c: p.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int k = p.length();
        int count = 0;
        int left = 0, right = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            right ++;
            if(right - left == k){
                if(window.equals(need)) {
                    count++;
                }
                char d = s.charAt(left);
                window.put(d,window.get(d) -1);
                if(window.get(d) == 0){
                    window.remove(d);
                }
                left ++;
            }
        }

        return count;

    }
}
