package Problems_on_Array.Easy_Questions;

import java.util.HashMap;
import java.util.Map;
public class Majority_Element_I {

    public int majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = arr.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = { 3,2,3 };

       Majority_Element_I m = new Majority_Element_I();

        int ans = m.majorityElement(nums);
        System.out.println(ans);

        // sanjeev kumar

    }
}
