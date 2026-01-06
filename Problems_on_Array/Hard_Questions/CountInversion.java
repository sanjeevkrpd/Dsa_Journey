package Problems_on_Array.Hard_Questions;

public class CountInversion {

    public static int count(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 7, 1, 3, 5};
        System.out.println(count(arr));
    }
}











