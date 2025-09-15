package Problems_on_Array.Easy_Questions;

public class Second_Largest_Sorting {

    public static int findSecondLargest(int arr[]){
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;


        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max=arr[i];
            }else{
                
                if (secondMax < arr[i]) {
                    secondMax = arr[i];
                }
            }
        }

        return secondMax;

    }

    public static void main(String[] args) {
         int arr[] = {2,4,1,54,14,23,45,46};

        System.out.println(findSecondLargest(arr));
    }
}
