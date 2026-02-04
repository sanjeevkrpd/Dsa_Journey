package RamdomQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "a";

        List<List<String>> ans = partition(s);

        System.out.println(ans);
    }

     public static List<List<String>> partition(String s) {
        
        List<List<String>> ans = new ArrayList<>();


        if(s.length() == 1 ){
        List<String> list = new ArrayList<>(); 
            list.add(s.substring(s.length()-1));

            ans.add(list);
            return ans;
        }


        List<String> list = new ArrayList<>(); 
        for (int i = 0; i < s.length(); i++) {

            String temp = ""+s.charAt(i);
            list.add(temp);
        }
        ans.add(list);

        
 List<String> temp = new ArrayList<>(); 

        int j = 0;

        for (int i = 1; i < s.length(); i++) {

            if (checkPalindrome(s.substring(j,i+1))) {
            
                temp.add(s.substring(j,i+1));
            }else{
                j++;
            }

            
        }
        temp.add(s.substring(s.length()-1));
        ans.add(temp);


        return ans;
    }

     public static boolean checkPalindrome(String substring) {

            int left = 0;
            int right = substring.length()-1;

            while (left < right) {
                if (substring.charAt(left) != substring.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
     }
}
