package Problems_on_Array.Medium_Questions;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

public static int longestConsecutive(int[] arr) {

    HashSet<Integer> set = new HashSet<>();
    
    for (int i = 0; i < arr.length; i++) {
        
        set.add(arr[i]);
    }

        int maxLength = 0;
        
        for (Integer data : set) {

            if (!set.contains(data-1)) {
                  int currCount = 0;
                while (set.contains(data++)) {
                    currCount ++;
                }
                maxLength = Math.max(maxLength , currCount);
            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        // int arr[] = {100, 4, 200, 1, 3, 2};  
        // int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};  
        int arr[] = {1, 9, 3, 10, 4, 20, 2};  

        int ans = longestConsecutive(arr);

        System.out.println(ans);
    }
}