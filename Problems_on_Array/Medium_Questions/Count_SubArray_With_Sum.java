package Problems_on_Array.Medium_Questions;

import java.util.HashMap;
import java.util.Map;

public class Count_SubArray_With_Sum {
    
    public static long countSubarrays(int [] nums,int k){
        Map<Long,Integer> freq = new HashMap<>();

        freq.put(0L, 1);

        long s = 0L;
        long ans = 0L;

        for(int x : nums){
            s += x;
            long need = s - k ;
            Integer cnt = freq.get(need);
            if (cnt != null) {
                ans += cnt;
            }

            freq.put(s, freq.getOrDefault(s, 0)+1 );
        }

        return ans;
    }
    public static void main(String[] args) {
        
       int nums[] = {1, 2, 3, -1, 2};
       int k =3;

       System.out.println(countSubarrays(nums, k));
    }
}
