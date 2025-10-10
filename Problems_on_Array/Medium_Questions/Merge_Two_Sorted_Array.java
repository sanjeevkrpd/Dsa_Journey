package Problems_on_Array.Medium_Questions;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
            
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return;
        }
        int i = m - 1;   
        int j = n - 1;      
        int k = m + n - 1;  
        while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
            
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
    }

    public static void main(String[] args) {

        int m = 4;
        int n = 3;
        int nums1[] = new int[m+n];
        int nums2[] = new int[n];
        nums1[0] = -5;
        nums1[1] = -2;
        nums1[2] = 4;
        nums1[3] = 5;
        nums2[0] = -3;
        nums2[1] = 1;
        nums2[2] =  8;


        Merge_Two_Sorted_Array t = new Merge_Two_Sorted_Array();

        t.merge(nums1, m, nums2, n);
        
        System.out.println(Arrays.toString(nums1));
    }
}
