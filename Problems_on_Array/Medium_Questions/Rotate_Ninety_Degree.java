package Problems_on_Array.Medium_Questions;


public class Rotate_Ninety_Degree {
    
    public static void main(String[] args) {
        

        int arr[][] = {
           {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        } ;

        findTranspose(arr);

    }

    public static void findTranspose(int[][] arr){
    int rows = arr.length;
    int cols = arr[0].length;

    int trans[][] = new int[cols][rows];

    for (int i = 0; i < cols; i++) {       
        for (int j = 0; j < rows; j++) {   
            trans[i][j] = arr[j][i];       
        }
    }

   

    for (int i = 0; i < trans.length; i++) {
        int left = 0 , right = trans[0].length-1;

       while (left < right) {
            
        int temp = trans[i][left];
        trans[i][left] = trans[i][right];
        trans[i][right] = temp;
        left++;
        right--;
       }
    }

    //copy

    for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                arr[i][j] = trans[i][j];
            }
    }

    //  // Print transposed matrix
    // for (int i = 0; i < trans.length; i++) {
    //     System.out.println(Arrays.toString(trans[i]));
    // }
    }
}
