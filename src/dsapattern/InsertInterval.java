package dsapattern;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public static int[][] insert(int[][] intervals,int [] newInterval){
        List<int[]> result = new ArrayList<>();

        for (int [] current: intervals) {
            // case 1: current interval is completely before the new interval
            if(current[1] < newInterval[0]){
                result.add(current);
                // case 2 after
            }else if(current[0] > newInterval[1]){
                result.add(newInterval);
                newInterval = current;
            }else{
               // case 3 overlap
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }

        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval = {4,9};
        int [][] result = insert(intervals,newInterval);
        for (int[] interval: result){
            System.out.println(interval[0]+ " " + interval[1]);
        }

    }
}
