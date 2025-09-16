package Problems_on_Array.Easy_Questions;

import java.util.Arrays;

public class Left_Rotate_By_D_Array {


    public static void reverse(int arr[] , int left , int right){

        while (left <= right) {
            int temp = arr[left];
            arr[left] =  arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }


    public static void leftRotateByD(int arr[], int d){

        if (arr.length > 1) {

            reverse(arr, 0, d);
            reverse(arr, d+1, arr.length-1);
            reverse(arr, 0, arr.length-1);
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        leftRotateByD(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
