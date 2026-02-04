package RamdomQuestions;

public class FindSumInRotatedSortedArray {
    public static void main(String[] args) {
        
            int nums[] = {11, 15, 6, 8, 9, 10};

            int target = 16;

            int piovt = Integer.MAX_VALUE;

            int left = 0;
            int right = nums.length-1;

            while (left < right) {
                
                
                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                }else{
                    right = mid;
                }

            }

            // initialize the ciruclar pointer

            int n = nums.length;
            piovt = left;
            right = (piovt - 1 + n) % n;

            //  got the piovet
            while (left != right) {
                

                int sum  = nums[left] + nums[right];

                if (sum == target) {
                    System.out.println("true");

                    return;
                }
                if (sum < target) { 
                    left = (left + 1) % n;
                }else{
                    right = (right - 1 + n) % n;
                }

            }


            System.out.println("false");



    }
}
