package RamdomQuestions;

import java.util.Arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        
        // int nums[] = {2,3,-2,4};
        int nums[] = {-3,-1,-1};
        // int nums[] = {-2,0,-1};



        int maxProductTillNow = nums[0];
        int minProductTillNow = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {


            int currVal = nums[i];

            int tempMax = Math.max(currVal, Math.max(maxProductTillNow * currVal, currVal * minProductTillNow));

            minProductTillNow = Math.min(currVal, Math.min(maxProductTillNow * currVal, currVal * minProductTillNow));

            maxProductTillNow = tempMax;

            result = Math.max(result, maxProductTillNow);

        
        }

        System.out.println(result);

    }
}
