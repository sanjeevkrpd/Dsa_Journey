package RamdomQuestions;

public class LongestCommonPrefix {

    public static void main(String[] args) {
    //    String[] strs = {"flower","flow","flight"};
       String[] strs = {"dog","racecar","car"};


        System.out.println(longestCommonPrefix(strs));
    }

     public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];   

        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonPrefix(prefix, strs[i]);
            if (prefix.length() == 0)
                return "";
        }

        return prefix;
    }

    public static String getCommonPrefix(String s1, String s2) {

       int len = Math.min(s1.length(), s2.length());
        int i = 0;

        while (i < len && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);

    }
}