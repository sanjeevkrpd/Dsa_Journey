package Problems_on_Array.Medium_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {

   public  List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums); 
        int n = nums.length;

        for (int i = 0; i < n-3; i++) {
            

            if (i > 0  && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i+1; j < n-2; j++) {
                
            if (j > i+1  && nums[j] == nums[j-1]) {
                continue;
            }
                int left = j+1;
                int right = n-1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                        while (left < right && nums[left] == nums[left+1] ) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right-1] ) {
                            right--;
                        }
                        left++;
                        right--;
                    }else if (sum < 0) {
                        left++;
                    }else{
                        right--;
                    }
                }

            }

        }
        return list;

    }

    public static void main(String[] args) {
        

        Four_Sum f = new Four_Sum();
        int nums[]= {-2, -1, 0, 0, 1, 2};
        List<List<Integer>> list  = new ArrayList<>();
        list = f.fourSum(nums, 0);

        for (List<Integer> l : list) {
            System.out.println(l);
        }



    }
}
