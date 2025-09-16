package Problems_on_Array.Easy_Questions;

import java.util.Arrays;

public class Left_Rotate_Array {

    public static void leftRotateByOne(int arr[]){
        
        if (arr.length > 2) {
               
            int temp = arr[0];
            
            for (int i = 0; i < arr.length-1; i++) {
                
                arr[i] = arr[i+1];
            }

            arr[arr.length-1] = temp;

        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};

        leftRotateByOne(arr);

        System.out.println(Arrays.toString(arr));

    }
}
