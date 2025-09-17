package Problems_on_Array.Medium_Questions;

import java.util.HashMap;
import java.util.Map;

public class Find_Appears_One_or_Two_Times {

    public static void countAppearence(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1); 
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 || entry.getValue() == 2) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " time(s).");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 3, 3, 3, 4};
        countAppearence(arr);
    }
}
