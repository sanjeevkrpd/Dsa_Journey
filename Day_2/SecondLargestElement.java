package Day_2;

public class SecondLargestElement {
    public static void main(String[] args) {
                int nums[] = {1,2,0,5,0,0,8,7,9,0,10};

                int maxElement = Integer.MIN_VALUE;
                int secondMaxElement = Integer.MIN_VALUE;

                for (int i = 0; i < nums.length; i++) {

                    if (maxElement < nums[i]) {
                        
                        secondMaxElement=maxElement;
                        maxElement = nums[i];
                    }
                    if (maxElement > nums[i] && secondMaxElement < nums[i]) {
                        secondMaxElement = nums[i];
                    }

                }
                System.out.println("1 greatest element " + maxElement);
                System.out.println("2 greatest element " + secondMaxElement);
    }
}
