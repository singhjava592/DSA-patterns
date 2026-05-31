package dsapattern;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t){

        if(s.length() < t.length()) return "";

        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        int left = 0, right = 0;
        int valid = 0;
        for(char c: t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int start = 0;
        int minLength = Integer.MAX_VALUE;
        while(right < s.length()){
            char c = s.charAt(right);
            right ++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);

                if (window.get(c).equals(need.get(c))){
                    valid ++;
                }

            }

            // SHrink
            while(valid == need.size()){
                if(right - left < minLength){
                    start = left;
                    minLength = right - left;
                }
                char d = s.charAt(left);
                left ++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        valid --;
                    }
                    window.put(d,window.get(d) -1);
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? "": s.substring(start,start + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
       String result = minWindow(s,t);
       System.out.println("Result is : "+ result);
    }


}
