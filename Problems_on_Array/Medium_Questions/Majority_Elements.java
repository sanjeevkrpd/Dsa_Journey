package Problems_on_Array.Medium_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Elements {

    public static List<Integer> majorityElement(int arr[]){
        int n = arr.length; 
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else{
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
        }

        for (Integer i : map.keySet()) {
          
            if (map.get(i) > n/3) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, 1, 1, 3, 2};
        int arr[] = {1, 2, 1, 1, 3, 2, 2};

        System.out.println("Majority Element is : "+majorityElement(arr));
    }
}
