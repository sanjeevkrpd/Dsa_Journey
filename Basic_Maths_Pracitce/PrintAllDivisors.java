package Basic_Maths_Pracitce;
import java.util.HashSet;
public class PrintAllDivisors {
    public static void main(String[] args) {
        int no  = 10;

        
        HashSet<Integer> set  = new HashSet<>();

        for (int i = 1; i * i < no; i++) {
            if (no % i == 0) {
                set.add(i);
                set.add(no / i);
            }
        }

        System.out.println(set);


        for (int i : set) {
            System.out.println(i);
        }

    }
}



