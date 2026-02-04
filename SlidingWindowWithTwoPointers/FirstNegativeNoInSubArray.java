package SlidingWindowWithTwoPointers;

import java.util.ArrayList;

public class FirstNegativeNoInSubArray {

    public static void main(String[] args) {

        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;

        System.out.println(firstNegativeInSubArray(arr, k));

    }

    public static ArrayList<Integer> firstNegativeInSubArray(int[] arr, int k) {

    ArrayList<Integer> ans = new ArrayList<>();

    for (int i = 0; i <= arr.length - k; i++) {

        boolean found = false;

        for (int j = i; j < i + k; j++) {
            if (arr[j] < 0) {
                ans.add(arr[j]);
                found = true;
                break;
            }
        }

        if (!found) {
            ans.add(0);
        }
    }

    return ans;
}

}
