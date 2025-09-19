package Problems_on_Array.Medium_Questions;

import java.util.Arrays;

public class Sort_Zero_Ones_Twos {


    public static void sortZeroOneTwo(int arr[]){

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
        
        int arr[] = {1, 0, 2, 1, 0};

        sortZeroOneTwo(arr);
        System.out.println(Arrays.toString(arr));
    }
}
