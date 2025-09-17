package Problems_on_Array.Easy_Questions;

public class Maximum_Consecutive_Ones {


    public static int countConsecutiveOnes(int arr[]){

        int maxCount = 0;

        if (arr.length < 1) {
            return 0;
        }

        int j=0;
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] == 1) {
                j++;
            }else{
                j=0;
            }
            maxCount = Math.max(maxCount, j);

        } 
        return maxCount;       
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 1, 1, 1, 0, 1};

        System.out.println(countConsecutiveOnes(arr));

    }
}
