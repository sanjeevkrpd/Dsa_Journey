package Problems_on_Array.Medium_Questions;

import java.util.HashMap;

public class Longest_Subarray_with_Sum {

    // Sliding-window: only valid if all array elements are non-negative
    public static int[] findLongestSubArrayNonNeg(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int currentSum = 0;
        int maxLen = 0;
        int bestStart = -1;
        int bestEnd = -1;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            // shrink while sum is too large
            while (start <= end && currentSum > target) {
                currentSum -= arr[start];
                start++;
            }

            // check equality
            if (currentSum == target) {
                int len = end - start + 1;
                if (len > maxLen) {
                    maxLen = len;
                    bestStart = start;
                    bestEnd = end;
                }
            }
        }
        return new int[]{bestStart, bestEnd, maxLen}; // start, end, length
    }

    // Prefix-sum + HashMap: works with negative numbers as well
    public static int[] findLongestSubArrayAny(int[] arr, int target) {
        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        int prefix = 0;
        int maxLen = 0;
        int bestStart = -1;
        int bestEnd = -1;

        firstIndex.put(0, -1); // prefix 0 at index -1

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int need = prefix - target;

            if (firstIndex.containsKey(need)) {
                int startIdx = firstIndex.get(need) + 1;
                int len = i - firstIndex.get(need);
                if (len > maxLen) {
                    maxLen = len;
                    bestStart = startIdx;
                    bestEnd = i;
                }
            }

            // store first occurrence of this prefix
            if (!firstIndex.containsKey(prefix)) {
                firstIndex.put(prefix, i);
            }
        }

        return new int[]{bestStart, bestEnd, maxLen};
    }

    // quick helper to print result
    private static void printResult(String label, int[] res, int[] arr) {
        int s = res[0], e = res[1], len = res[2];
        if (s == -1) {
            System.out.println(label + " -> no subarray found");
        } else {
            System.out.print(label + " -> start: " + s + " end: " + e + " length: " + len + " subarray: [");
            for (int i = s; i <= e; i++) {
                System.out.print(arr[i] + (i < e ? ", " : ""));
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5};
        int target = 5;

        int[] resNonNeg = findLongestSubArrayNonNeg(arr, target);
        printResult("Sliding window (non-negative)", resNonNeg, arr);

        int[] resAny = findLongestSubArrayAny(arr, target);
        printResult("Prefix-sum + HashMap (any ints)", resAny, arr);
    }
}
