package twopointers;

public class LongestUniformSubstring {

    public static int characterReplacement(String s, int k){
        int [] freq = new int[26];
        int left = 0;
        int maxLength = 0;

        for(int right  = 0; right < s.length(); right ++){
            freq[s.charAt(right) - 'A'] ++;
            int maxFreq = getMaxFres(freq);

            while((right - left +1) - maxFreq > k){
                freq[s.charAt(left) - 'A'] --;
                left ++;
                maxFreq = getMaxFres(freq);
            }
            maxLength = Math.max(maxLength,right - left + 1);

        }
        return maxLength;
    }

    private static int getMaxFres(int[] freq) {
        int max = 0;
        for(int count: freq){
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
       System.out.println(characterReplacement("AABABBA",1));
    }
}

// o(n * 26) -- o(n)