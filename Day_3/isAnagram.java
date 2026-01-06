package Day_3;

public class isAnagram {

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if (s.length() != t.length()) {
            System.out.println("false");
        }

        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;

        }
        int count = 0;
        for (int i : freq) {
            if (i != 0) {
                count++;
            }
        }

        if (count > 0) {

            System.out.println("false");
        } else {

            System.out.println("true");
        }

    }
}
