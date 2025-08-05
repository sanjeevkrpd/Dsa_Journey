package Basic_Maths_Pracitce;
public class ArmstrongNumber {
    public static void main(String[] args) {
        

        int no = 153;
        int temp = no;
        int armstrong = 0;
        while (no > 0) {
            int rem = no % 10;
            rem = (int) Math.pow(rem,3);
            armstrong +=rem;
            no /=10;
        }

        if (armstrong == temp) {
            System.out.println("yes the no is ArmstrongNumber");
        }else{
            System.out.println("yes the no is ArmstrongNumber");
        }

    }
}


// 153 => 1^3 + 5^3 + 3^3 = 153