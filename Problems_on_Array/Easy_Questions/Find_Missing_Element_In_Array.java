package Problems_on_Array.Easy_Questions;

public class Find_Missing_Element_In_Array {
    public static int findMissingBySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int m = arr.length;      
        int N = m + 1;    
        long expected = (long) N * (N + 1) / 2;

        long actual = 0;
        for (int v : arr) {
            actual += v;
        }

        long missing = expected - actual;
        if (missing <= 0 || missing > N) {
          
            throw new IllegalArgumentException("Input array doesn't match expected format.");
        }

        return (int) missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissingBySum(arr));
    }
}
