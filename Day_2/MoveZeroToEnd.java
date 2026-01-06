package Day_2;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        
        

        int arr[] = {1,2,0,5,0,0,8,7,9,0,10};

        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }



        System.out.println(Arrays.toString(arr));            
    }
}
