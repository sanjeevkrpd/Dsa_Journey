package Problems_on_Array.Medium_Questions;

import java.util.HashMap;

public class Largest_Zero_Sub_Array {

    public int maxLen(int[] arr) {

        if (arr == null || arr.length == 0) return 0;
       HashMap<Integer,Integer> map = new HashMap<>();

       map.put(0,-1);

       int sum = 0;
       int maxlen = 0;
       for (int i = 0; i < arr.length; i++) {
        
             sum +=arr[i];

            if (map.containsKey(sum)) {
                
                int prevIndex = map.get(sum);
                int length = i-prevIndex;

                if (length > maxlen) {
                    
                    maxlen = length;

                }
            }else{
                    map.put(sum, i);
            }
       }
       return maxlen;
    }
    public static void main(String[] args) {
        
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        Largest_Zero_Sub_Array l = new Largest_Zero_Sub_Array();

        int ans = l.maxLen(arr);

        System.out.println(ans);
    }
}
