package Day_3;

import java.util.Arrays;

public class ReverseAWord {
    public static void main(String[] args) {
        

        String s = "I Love Google";
        
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));
        
        int left=0, right = a.length-1;
        
        while (left < right) {
            
            String st = a[left];
            a[left] = a[right];
            a[right] = st;
            
            left++;
            right--;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
