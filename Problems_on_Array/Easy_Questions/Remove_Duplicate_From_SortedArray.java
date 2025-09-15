package Problems_on_Array.Easy_Questions;

import java.util.HashSet;

public class Remove_Duplicate_From_SortedArray {



    public static void main(String[] args) {
        
         int arr[] = {1,1,1,2,2,2,3,4}; // {1,2,3,4}

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            
            set.add(arr[i]);
        }

        System.out.println(set);
    } 
    
}
