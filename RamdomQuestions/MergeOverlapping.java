package RamdomQuestions;

import java.util.*;
public class MergeOverlapping {
    public static void main(String[] args) {
        int arr[][] = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};


        

            int[][] result = mergeOverlap(arr);

            for (int[] is : result) {
                
                System.out.println(Arrays.toString(is));
            }
    }


    public static int[][] mergeOverlap(int[][] intervals){

        if (intervals.length < 1) {
            return intervals;
        }
            Arrays.sort(intervals , (a,b) -> a[0] - a[0]);

            List<int[]> merged = new ArrayList<>();

            merged.add(intervals[0]);

            for (int i = 1; i < intervals.length; i++) {

                int last[] = merged.get(merged.size()-1);
                int current[] = intervals[i];

                if (current[0] <= last[1]) {
                    last[1] = Math.max(current[1], last[1]);
                }else{
                    merged.add(current);
                }
                
            }

        return merged.toArray(new int[merged.size()][]);

    }
}
