package Problems_on_Array.Medium_Questions;

import java.util.HashSet;

public class Two_Sum {

    public static String two_sum(int arr[], int target){

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < arr.length; i++) {
                
                if (set.contains(target - arr[i])) {

                    return "YES";
                }else{
                    set.add(arr[i]);
                }
            }

        return "NO";
    }
    public static void main(String[] args) {
        
       int arr[] = {2,6,5,8,11};
       int target = 15;
        
       System.out.println(two_sum(arr, target));
    }
}
