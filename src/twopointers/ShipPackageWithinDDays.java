package twopointers;

public class ShipPackageWithinDDays {

    public static int shipWithinDDays(int [] weights, int D){
        int low = getMax(weights);
        int high = getSum(weights);

        int answer = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canShip(weights,D,mid)){
                answer = mid;
                high = mid -1;
            }else{
                low  = mid +1;
            }
        }
        return answer;
    }

    private static boolean canShip(int[] weights, int d, int capacity) {

        int days =1;
        int load = 0;

        for(int w: weights){
            if(load + w > capacity){
                days++;
                load = w;
            }else{
                load+=w;
            }
        }
        return days <= d;
    }

    private static int getSum(int[] weights) {
        int sum = 0;
        for(int num: weights){
            sum += num;
        }
        return sum;
    }

    private static int getMax(int[] weights) {
        int max = weights[0];
        for(int num: weights){
            max = Math.max(max,num);
        }
        return max;
    }

    public static void main(String[] args) {
        int [] weight = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        int result = shipWithinDDays(weight,D);
        System.out.println("Minimum capacity found: "+result);
    }
}

// n*long(sum)

