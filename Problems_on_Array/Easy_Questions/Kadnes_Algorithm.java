package Problems_on_Array.Easy_Questions;

public class Kadnes_Algorithm {
    public static void main(String[] args) {
        
        int nums[] = {2, 3, 5, -2, 7, -4};
        // int nums[] = {-2, -3, -7, -2, -10, -4};

        int maxSum = nums[0]; 
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);  
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println(maxSum);
    }
}
