package twopointers;

public class KokoBanana {

    public static int minEatingSpeed(int [] piles, int h){
        int low = 1;
        int high = getMaxBanana(piles);
        int answer = high;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(CanEat(piles,h,mid)){
                answer = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }

        }
        return answer;

    }

    private static int getMaxBanana(int[] piles) {
        int max = piles[0];
        for(int num: piles){
            max = Math.max(max,num);
        }
        return max;
    }

    private static boolean CanEat(int[] piles, int h, int k) {

        int hours = 0;
        for(int pile : piles){
            //hours+=(pile + k -1)/k;
            hours += (int) Math.ceil((double) pile/k);
        }
        return hours <= h;

    }

    public static void main(String[] args) {
        int [] piles = {3,6,7,11};
        int h = 8;
        System.out.println("Minimum speed : "+ minEatingSpeed(piles,h));
    }
}

