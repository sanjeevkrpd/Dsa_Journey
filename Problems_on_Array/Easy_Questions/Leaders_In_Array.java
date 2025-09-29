package Problems_on_Array.Easy_Questions;

public class Leaders_In_Array {
    public static void main(String[] args) {
        
        // int arr[] = {1, 2, 5, 3, 1, 2};
        int arr[] = {-3, 4, 5, 1, -4, -5};

        findLeaders(arr);

    }

   private static void findLeaders(int[] arr) {
    int n = arr.length;
    int maxFromRight = arr[n - 1];

    System.out.print("Leaders: " + maxFromRight + " "); 

    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] > maxFromRight) {
            maxFromRight = arr[i];
            System.out.print(maxFromRight + " ");
        }
    }
}

}
