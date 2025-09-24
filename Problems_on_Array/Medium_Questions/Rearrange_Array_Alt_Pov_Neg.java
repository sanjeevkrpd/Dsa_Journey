package Problems_on_Array.Medium_Questions;

import java.util.Arrays;

public class Rearrange_Array_Alt_Pov_Neg {

    public static int[] reArrangeTheArray(int arr[]){

        int posArr[] = new int[arr.length];
        int negArr[] = new int[arr.length];

        int posCount = 0;
        int negCount = 0;

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {           
                posArr[posCount++] = arr[i];
            } else {
                negArr[negCount++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(posArr));
        System.out.println(Arrays.toString(negArr));

        int i = 0, j = 0, k = 0;
        while (i < posCount && j < negCount) {
            arr[k++] = posArr[i++];   
            arr[k++] = negArr[j++];   
        }

        
        while (i < posCount) {
            arr[k++] = posArr[i++];
        }

        
        while (j < negCount) {
            arr[k++] = negArr[j++];
        }

        return arr;
    }

    public static void main(String[] args) {
        // int arr[] = {1, 2, -4, -5};
        // The line `// int arr[] = {1, 2, -4, -5};` is a commented-out line of code in the Java
        // program. It is not being executed as it is preceded by `//`, which makes it a single-line
        // comment in Java.
        int arr[] = {1, -1, -3, -4, 2, 3};
        System.out.println(Arrays.toString(reArrangeTheArray(arr)));
    }
}
