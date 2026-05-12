package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public static int [][] merge(int [] [] intervals){
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int last [] = result.get(result.size() -1);
            int current [] = intervals[i];

            if(current[0] <= last[1]){
                last[1] = Math.max(last[1],current[1]);
            }else{
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int [][] result = merge(intervals);
        for (int i = 0; i < result.length; i++) {
         //   System.out.println((Arrays.toString(intervals[0]) + " "+ Arrays.toString(intervals[1])));
             System.out.println((Arrays.toString(result[i])));
        }
    }
}
