package Problems_on_Array.Medium_Questions;

import java.util.HashMap;

public class Count_Xor {


    public void getSubXors(int arr[] , int k  ){
        
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            
            int currXor = 0; 
           
            for (int j = i; j < arr.length; j++) {
                currXor ^= arr[j]; 
                
                if (currXor == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays with XOR = " + k + " is: " + count);
    }

    
    public void getOptSubXor(int arr[] , int k){
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int xor=0;
        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {

            xor^=arr[i];

          
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }

            map.put(xor, map.getOrDefault(xor, 0)+1);
        }

        System.out.println(count);
    }


    public static void main(String[] args) {
        
        int arr[] = {4, 2, 2, 6, 4};
        // The line `int arr[] = {4, 2, 2, 6, 4};` is initializing an integer array `arr` with the
        // values `{4, 2, 2, 6, 4}`. This array contains a sequence of integers that will be used as
        // input for the XOR operations in the `getSubXors` and `getOptSubXor` methods of the
        // `Count_Xor` class.
        // int arr[] = {5, 6, 7, 8, 9};
        int k = 6;

        Count_Xor c = new Count_Xor();
        c.getSubXors(arr, k);
        System.out.println("-------------------------");
        c.getOptSubXor(arr, k);
    }
}
