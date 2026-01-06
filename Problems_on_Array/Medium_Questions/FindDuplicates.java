package Problems_on_Array.Medium_Questions;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,2,2};


        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            
        

            if (s.contains(arr[i])) {
                System.out.println(arr[i]);
            }
            
            s.add(arr[i]);

        }



        // slow and fast pointer 





    }
}
