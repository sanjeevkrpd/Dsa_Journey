package RamdomQuestions;

public class RemoveConsecutiveCharacter {

    public static void main(String[] args) {
        String s = "abcddcba";


        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            

            if (characterIsMatching(s,sb,i)) {
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean characterIsMatching(String s,StringBuilder sb, int i) {
        
                
                    if (sb.charAt(sb.length()-1) == s.charAt(i)) {
                        return true;
                    }else{
                        return false;
                    }

    }
}