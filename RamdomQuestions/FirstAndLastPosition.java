package RamdomQuestions;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        

        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        int firstOccurance = -1;
        int lastOccurance = -1;
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            
            int mid = (left + right) /2;

            if (nums[mid] == target ) {
                    right = mid;
            }else{
                left = mid + 1;
            }
        }

        firstOccurance = left;
        left = 0;
        right = nums.length-1;
        
        
        while (left < right) {
            
            int mid = (left + right) /2;

            if (nums[mid] == target) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        System.out.println(right);

        
    }
}
