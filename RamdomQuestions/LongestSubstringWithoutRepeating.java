package RamdomQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

     public static void main(String[] args) {
        
        String s = "abcabcbb";


        HashSet<Character> set = new HashSet<>();


        int left = 0;
        int maxLength=0;
        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            
             while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }


            maxLength = Math.max(maxLength , right - left +1);

            set.add(ch);

        }


        System.out.println(maxLength);
     }
}