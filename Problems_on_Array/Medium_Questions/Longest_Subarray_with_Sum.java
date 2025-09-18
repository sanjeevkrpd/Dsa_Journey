package Problems_on_Array.Medium_Questions;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_with_Sum {
 
 
    public static int findLongestSubArrayNonNeg(int arr[], int target){

        int maxLenght = 0;
        int start = 0;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {

            currSum +=arr[i];

            while (start <= i && currSum > target) {
                currSum -=arr[start];
                start++;
            }

            if (currSum == target) {
                int len = i - start + 1 ;
                maxLenght = Math.max(maxLenght,len);
            }   
        }
        return maxLenght;

    }
  

     public static int findLongestSubArrayAny(int[] arr, int target) {
        if (arr == null || arr.length == 0) return 0;

        Map<Long, Integer> firstIdx = new HashMap<>(); 
        long prefix = 0L;
        firstIdx.put(0L, -1); 
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            long needed = prefix - target;
            if (firstIdx.containsKey(needed)) {
                int len = i - firstIdx.get(needed);
                if (len > maxLen) {
                    maxLen = len;
                }
            }
            
            if (!firstIdx.containsKey(prefix)) {
                firstIdx.put(prefix, i);
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        int arr[] = {1,-2,3,1,-1,2,-2,3};

        // int ans[] = new int[3];

        // System.out.println(findLongestSubArrayNonNeg(arr, 15));
        System.out.println(findLongestSubArrayAny(arr, 3));


    }
 
}
