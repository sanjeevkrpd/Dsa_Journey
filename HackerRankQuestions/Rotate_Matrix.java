package HackerRankQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotate_Matrix {

    
    public static int[][] rotateRight90(int[][] mat) {
        int N = mat.length;
        int[][] res = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[j][N - 1 - i] = mat[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[][] matrix = new int[N][N];

       
        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

    
        String rotate = br.readLine();

        int rotateDegree = 0;

        for (int i = 0; i < rotate.length(); i++) {
            char ch = rotate.charAt(i);
            if (ch == 'R') {
                rotateDegree += 90;
            } else if (ch == 'L') {
                rotateDegree -= 90;
            }
        }

      
        rotateDegree = ((rotateDegree % 360) + 360) % 360;

      
        int times = rotateDegree / 90; 
        for (int i = 0; i < times; i++) {
            matrix = rotateRight90(matrix);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j != N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
