package Basic_Maths_Pracitce;
public class CheckPalindrome {
    public static void main(String[] args) {
        

        int no = 122154;
        int temp = no;

        int rev = 0;
        while (no > 0) {
            int rem = no % 10;
            rev = (rev * 10) + rem;
            no /=10; 
        }

        if (temp == rev) {
            System.out.println("No is palindrome");
        }else{
            System.out.println("No is not palindrome");
        }
    }
}
