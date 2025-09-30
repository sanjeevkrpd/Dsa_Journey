package Problems_on_Array.Medium_Questions;

public class Spiral_Traversal_Of_Matrix {
    public static void main(String[] args) {
        
        int Matrix[][] = { { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },
		      { 9, 10, 11, 12 },
	              { 13, 14, 15, 16 } };

            int top = 0;
            int bottom = Matrix.length - 1;      
            int left = 0;
            int right = Matrix[0].length - 1;


           while (top <= bottom && left <= right) {

                     
                     for (int i = top; i <= right; i++) {
                        System.out.print(Matrix[top][i] + " -> ");
                        
                     }
                     top++;

                     for (int i = top; i <= bottom; i++) {
                        System.out.print(Matrix[top][right] + " -> ");
                     
                     }
                     right--;

                     if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                            
                            System.out.print(Matrix[bottom][i] + " -> ");
                         
                        }
                        bottom--;
                     }
                    if (left <= right) {
                            for (int i = bottom; i >= top; i--) {
                                System.out.print(Matrix[i][left] + " -> ");
                              
                            }
                            left++;  
                        }
           }
    }
}
