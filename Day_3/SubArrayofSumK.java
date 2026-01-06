package Day_3;

import java.util.HashMap;

public class SubArrayofSumK {
    public static void main(String[] args) {
     
        int k = 3;
        int nums[]={1,2,3};
        int left = 0;
        int sum = 0;
        int maxLength = 0;
     
        HashMap<Integer,Integer> map = new HashMap<>();


        map.put(0,-1 );

        for (int right = 0; right < nums.length; right++) {

            sum +=nums[right];

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, right - map.get(sum - k));
            }

            map.putIfAbsent(sum, right);
            
        }
        System.out.println(maxLength);
    }
}
