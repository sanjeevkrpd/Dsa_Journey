package SlidingWindowWithTwoPointers;

public class MaximumSumSubarryWithK {
    public static void main(String[] args) {
        
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSubarrySum(arr, k));

    }


    public static int maxSubarrySum(int[] arr, int k){


        int left = 0;
        int maxSum = 0;

        int n = arr.length;

        int r = k;

        int sum = 0; 
        for (int i = 0; i < r; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum);

        while (r < n) {
            

                sum += arr[r];
                r++;
                sum -=arr[left];
                left++;

                maxSum=Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
