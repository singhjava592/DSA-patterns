package twopointers;

public class HappyNumber {
    public static boolean isHappy(int n){

        int slow = n;
        int fast = n;
        while(true){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if(fast ==1) return true;
            if(slow == fast) return false;
        }

    }

    private static int getNext(int n) {
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit*digit);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n =  20;
        if(isHappy(n)){
            System.out.println("This is happy number");
        }else{
            System.out.println("This is not  happy number");
        }
    }
}
