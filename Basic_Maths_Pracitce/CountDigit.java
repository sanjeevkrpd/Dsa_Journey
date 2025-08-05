package Basic_Maths_Pracitce;

public class CountDigit {
    public static void main(String[] args) {
        
        int no = 736454948;

        int count = 0;

        while (no > 0) {
            count++;
            no = no/10;
        }

        System.out.println("Total no in the digit = " + count);


    }
}
