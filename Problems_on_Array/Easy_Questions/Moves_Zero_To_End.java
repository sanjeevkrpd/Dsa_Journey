package Problems_on_Array.Easy_Questions;

import java.util.Arrays;

public class Moves_Zero_To_End {

    public static void moveZeroToEnd(int arr[]){

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }

        while (idx < arr.length) {
            arr[idx++] = 0;
        } 

    }
    public static void main(String[] args) {
        
        int arr[] = {0,0,1,2,0,1,0,0};
        moveZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));

    }
}
