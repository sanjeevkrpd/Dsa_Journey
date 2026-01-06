package Day_2;

public class LongestSubArrayOfSumK {
    public static void main(String[] args) {
        
        int arr[] = {1,2,0,5,0,0,8,7,9,0,10};


        int k = 8 , sum = 0 , left = 0, maxLength=0;

       
        for ( int right  = 0; right < arr.length; right++) {

            sum += arr[right];


            if (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength ,right-left+1);
            }


        }
        System.out.println(maxLength);
    }
}
