package Problems_on_Array.Medium_Questions;

import java.util.Arrays;

public class Next_Permutation {

    public static void main(String[] args) {

        // int arr[] = { 1,2,3,5,4,3,2};
        // int arr[] = { 1,2,3};
         int arr[] = { 1,1,1};
        
        findNextPermutation(arr);

        System.out.println(Arrays.toString(arr));
        
    }

    private static void findNextPermutation(int[] arr) {

        int n = arr.length;
        int i = arr.length - 2;

        while (i >=0 &&  arr[i] >= arr[i+1]) {
            i--;
        }

        if (i >= 0) {
              int j = n - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        int left = i+1; 
        int right = n-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;
        } 

    }
}