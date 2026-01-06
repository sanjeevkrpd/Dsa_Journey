package RepeatSolutions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        
        int nums[] = {1,2,0,0,5,6,9,0,10};

        int index = 0;


        for (int i = 0; i < nums.length; i++) {
            
                if (nums[i] != 0) {
                    
                    nums[index] = nums[i];
                    index++;
                }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }


        System.out.println(Arrays.toString(nums));
    }
}
