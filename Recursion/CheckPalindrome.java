package Recursion;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str, int start, int end) {
        // Base case: if pointers cross, it's a palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recurse for the inner substring
        return checkPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        int start = 0;
        int end = s.length() - 1;
        boolean result = checkPalindrome(s, start, end);
        System.out.println("Is palindrome: " + result);
    }
}
