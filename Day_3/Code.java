package Day_3;

public class Code {
    public static void main(String[] args) {
        
        int nums[] = {2,1,5,1,3,2};
        int k = 3;
        int maxSum = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            
            int sum = 0;

            for (int j = i; j < i+k; j++) {
                
                sum += nums[j];

            }
            maxSum = Math.max(maxSum, sum);

            
        }

        System.out.println(maxSum);

    }
}
