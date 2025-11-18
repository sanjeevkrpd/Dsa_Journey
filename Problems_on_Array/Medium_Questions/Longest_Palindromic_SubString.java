package Problems_on_Array.Medium_Questions;

public class Longest_Palindromic_SubString {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0; 

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);     
            int len2 = expandAroundCenter(s, i, i + 1); 
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
             
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        Longest_Palindromic_SubString solver = new Longest_Palindromic_SubString();
        System.out.println(solver.longestPalindrome("babad"));
        System.out.println(solver.longestPalindrome("cbbd"));
        System.out.println(solver.longestPalindrome("a"));    
        System.out.println(solver.longestPalindrome("ac"));   
    }
}
