package Problems_on_Array.Easy_Questions;

import java.util.Arrays;

public class Moves_Zero_To_First {

    public void moveZeroToFirst(int arr[]){

       int low = 0, mid = 0, high = arr.length-1;

        while (mid <= high) {
            
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {2,0,2,1,1,0};
        Moves_Zero_To_First m = new Moves_Zero_To_First();
        m.moveZeroToFirst(arr);
        System.out.println(Arrays.toString(arr));

    }
}
