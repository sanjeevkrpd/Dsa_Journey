package Basic_Maths_Pracitce;
public class ReverseNumber {
    public static void main(String[] args) {
        

        int no = 321987654;

        int rev = 0;


        while (no > 0) {
            int rem = no % 10;
            rev = (rev * 10) + rem;
            no = no/10;
        }

        System.out.println("this is the rev of the no "+ rev);
    }
}
