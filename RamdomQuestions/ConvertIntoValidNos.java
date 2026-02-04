package RamdomQuestions;

public class ConvertIntoValidNos {
    public static void main(String[] args) {
        
 
        String[] strs = {
            "2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
        };

        String output = "";
        String input = "GEEKSFORGEEKS";


        for (int i = 0; i < input.length(); i++) {
          

                if (input.charAt(i) == ' ') {
                    output = output + "0";
                }else{

                        int pos = input.charAt(i) - 'A';

                        output = output + strs[pos];
                }
        }

        System.out.println(output);
    }
}
