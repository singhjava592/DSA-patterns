package twopointers;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        int left = 0;
        int right  = s.length() -1;

        while(left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);

            if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}

// rabar
// rabbar


