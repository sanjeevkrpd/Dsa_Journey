package Problems_on_Array.Hard_Questions;

import java.util.Arrays;

import java.util.HashSet;

public class Find_Repeating_And_Missing_No {

    public int[] findMissingRepeatingNumbers(int[] nums) {
        if (nums == null || nums.length == 0 ) {
            return new int[] {-1,-1};
        }

        int n = nums.length;
        int ans[] = {-1,-1};
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (set.contains(nums[i])) {
                ans[0] = nums[i];
            }else{
                set.add(nums[i]);
                sum += nums[i];
            }

        }

            ans[1] = (n*(n+1)/2) - sum;

        return ans;

    }
     public int[] second_findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        long sum_n = n * (n + 1L) / 2;
        long sum_sq_n = n * (n + 1L) * (2L * n + 1) / 6;

        long sum_arr = 0;
        long sum_sq_arr = 0;

        for (int num : nums) {
            sum_arr += num;
            sum_sq_arr += (long) num * num;
        }

        long diff = sum_arr - sum_n;           
        long sqDiff = sum_sq_arr - sum_sq_n;    

        long sum_xy = sqDiff / diff;           

        int x = (int) ((diff + sum_xy) / 2);   
        int y = (int) (x - diff);              

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        // int nums[]= {3, 5, 4, 1, 1};
        // int nums[]= {1, 2, 3, 6, 7, 5, 7};
        int nums[]= {6, 5, 7, 1, 8, 6, 4, 3, 2};

        Find_Repeating_And_Missing_No f = new Find_Repeating_And_Missing_No();


        int ans[] = new int[2];

        ans = f.findMissingRepeatingNumbers(nums);

        System.out.println(Arrays.toString(ans));

    }
}
