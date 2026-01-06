package Day_3;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {


        HashSet<Character> set = new HashSet<>();
        String s = "abcabcbb";
        int left = 0 , maxLength = 0;


        for (int right = 0; right < s.length(); right++) {

                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(right));
                    left++;
                }
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left +1);
        }

        System.out.println(maxLength);
    }

}
