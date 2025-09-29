package Problems_on_Array.Medium_Questions;

public class Set_Matrix_To_Zero {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setMatrixToZero(arr);

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setMatrixToZero(int[][] arr) {
        if (arr == null || arr.length == 0) return;

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] rowToZero = new boolean[rows];
        boolean[] colToZero = new boolean[cols];

     
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowToZero[i] = true;
                    colToZero[j] = true;
                }
            }
        }

    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowToZero[i] || colToZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
