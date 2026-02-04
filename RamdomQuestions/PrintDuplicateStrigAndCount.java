package RamdomQuestions;

import java.util.HashMap;

public class PrintDuplicateStrigAndCount {
    public static void main(String[] args) {
        String s = "geeksforgeeks";


        HashMap<Character,Integer> map = new HashMap<>();

        int frequency[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
                
            // frequency[s.charAt(i) - 'a']++;
           
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char ch : map.keySet()) {
    if (map.get(ch) > 1) {
        System.out.println(ch + " -> " + map.get(ch));
    }
}

    }
}
