package Day_3;

import java.util.HashMap;

public class LongestSubstringDistinct {
    public static void main(String[] args) {
      String s = "eceba";
        int k = 2;


        int left=0,maxLength=0;

        HashMap<Character,Integer> map = new HashMap<>();


        for (int right = 0; right < s.length(); right++) {
            
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0)+1);

            while (map.size() > k) {
                
                char l = s.charAt(left);

                map.put(l, map.get(l) - 1);

                if (map.get(l) == 0) {
                    map.remove(l);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right-left+1);            
        }

        System.out.println(maxLength);

    }
}
