package RamdomQuestions;

public class LongestPalindromicSubstring {

        // public static void main(String[] args) {
            
        //     String s = "babad";

        //     String longest = "";
        //     for (int i = 0; i < s.length(); i++) {
                
        //             for (int j = i; j < s.length(); j++) {
                                
        //                 String sub = s.substring(i, j+1);

        //                 if (isPalindromic(sub) && longest.length() < sub.length() ) {
        //                     longest = sub;
        //                 }
        //              }
        //     }

        //     System.out.println(longest);
        // }

        //  static boolean isPalindromic(String sub) {

        //     int left = 0 ;
        //     int right = sub.length()-1;

        //     while (left <=right) {
                
        //         if (sub.charAt(left) != sub.charAt(right)) {
        //             return false;
        //         }

        //         left++;
        //         right--;
        //     }
        //     return true;
        // }

 
 
        public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
           
            int len1 = expandFromCenter(s, i, i);
    
            int len2 = expandFromCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }


        public static void main(String[] args) {
            
        }


    }