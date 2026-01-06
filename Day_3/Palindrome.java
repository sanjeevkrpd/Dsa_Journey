package Day_3;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Madam".toLowerCase();



        int left = 0 , right = s.length()-1;

        Boolean ans  = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                
                ans = false; 
            }
            left++;
            right--;

        }
        System.out.println(ans);

    }
}
