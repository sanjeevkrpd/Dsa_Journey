package Problems_on_Array.Hard_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Overlapping {

    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals) {

        List<List<Integer>> merged = new ArrayList<>();
        if (intervals == null || intervals.size() == 0)
            return merged;

        intervals.sort(Comparator.comparingInt(a -> a.get(0)));

        List<Integer> curr = new ArrayList<>(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {

            List<Integer> next = new ArrayList<>(intervals.get(i));

              if (next.get(0) <= curr.get(1)) {
                curr.set(1, Math.max(curr.get(1), next.get(1)));
            } else {
               
                merged.add(curr);
                curr = new ArrayList<>(next);
            }

        }
        merged.add(curr);
        return merged;
    }


    public int[][] merge(int[][] intervals) {

          if (intervals == null || intervals.length == 0) return new int[0][];

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] curr = intervals[0].clone();

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i].clone();

            if (curr[1] >= next[0]) {
                curr[1] = Math.max(curr[1], next[1]);
            }else{
                merged.add(curr);
                curr = next.clone();
            }
        }

              merged.add(curr);

        return merged.toArray(new int[merged.size()][]);



    }



    public static void main(String[] args) {

      List<List<Integer>> intervals = new ArrayList<>();
            intervals.add(List.of(1, 5));
            intervals.add(List.of(3, 6));
            intervals.add(List.of(8, 10));
            intervals.add(List.of(15, 18));
        Merge_Overlapping m = new Merge_Overlapping();

        int interval[][] = { {1,5},{3,6},{8,10},{15,18} };
        List<List<Integer>> l = new ArrayList<>();

        // l = m.mergeOverlap(intervals);

        // for (List<Integer> list : l) {
        //     System.out.println(list);
        // }

        int ans [][] = m.merge(interval);

        for (int i = 0; i < ans.length; i++) {
            System.out.print("[");
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
                if (j < ans[i].length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

    }
}
