package Problems_on_Array.Medium_Questions;
import java.util.HashSet;

public class Find_The_Union {

    public static void findUnion(int arr[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

 
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

     
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {3,4,5,6,7,8,9};

        findUnion(arr, arr2);
    }
}
