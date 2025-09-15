package Problems_on_Array.Easy_Questions;

public class Largest_Element_In_Array {


    public static int findLargest(int arr[]){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,54,14,23,45};

        System.out.println(findLargest(arr));
    }
}
