package RamdomQuestions;

public class FindMinimumOfMerge {
    public static void main(String[] args) {
        int arr[] = {11, 14, 15, 99};


        System.out.println(countNoOfMergeOperation(arr));
    }

    public static int countNoOfMergeOperation(int[] arr) {

            int ans = 0;
            if (arr == null || arr.length < 2) {
                return ans;
            }

            int left = 0;
            int right = arr.length-1;


            while (left < right) {


                if (arr[left] == arr[right]) {

                    left++;
                    right--;

                }else if (arr[left] > arr[right]) {
                    arr[left + 1] += arr[left];
                    left++;
                    ans++;
                }else{
                   arr[right - 1] += arr[right];
                    right--;
                    ans++;
                }

            }   

            return ans;
    }
}
