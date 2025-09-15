package Sorting_techniques;

import java.util.Arrays;

public class MergeSort {

    public static void merge_sort(int arr[], int left, int right) {
        // Base case to stop recursion
        if (left >= right) {
            return;
        }

        // find the middle point
        int mid = left + (right - left) / 2;

        // sort first and second half
        merge_sort(arr, left, mid);
        merge_sort(arr, mid + 1, right);

        // merge the sorted halves
        merge(arr, left, mid, right);
    }

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;  

  
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

            for (; i < n1 || j < n2; k++) {
                if (i < n1) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
            }

    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        merge_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
