package Recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void reverseArray(int arr[] , int start, int end){
        if (end <= start) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start = start + 1, end = end - 1);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int start = 0 , end = arr.length-1;
        reverseArray(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }
}
