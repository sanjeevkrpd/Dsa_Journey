package RamdomQuestions;


public class ReverseString {
    public static void main(String[] args) {
        

        String s = "Sanjeev";

        char ch[]  = s.toCharArray();

        int left  = 0;
        int right = ch.length-1;
        String ans = "";
        while (left <= right) {
            
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            
            left++;
            right--;
        }

        

        for (int i = 0; i < ch.length; i++) {
            ans += ch[i];
        }
        System.out.println(ans);
    }
}
