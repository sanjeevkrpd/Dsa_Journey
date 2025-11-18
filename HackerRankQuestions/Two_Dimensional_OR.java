package HackerRankQuestions;

// import java.util.Scanner;

// public class Two_Dimensional_OR {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int N = sc.nextInt(); 
//         int M = sc.nextInt(); 
//         int[][] grid = new int[N][M];

//         for (int i = 0; i < N; i++)
//             for (int j = 0; j < M; j++)
//                 grid[i][j] = sc.nextInt();

//         int Q = sc.nextInt();


//         for (int q = 0; q < Q; q++) {
//             int r1 = sc.nextInt() - 1; 
//             int c1 = sc.nextInt() - 1;
//             int r2 = sc.nextInt() - 1;
//             int c2 = sc.nextInt() - 1;

//             int result = 0;

//             for (int i = r1; i <= r2; i++) {
//                 for (int j = c1; j <= c2; j++) {
//                     result |= grid[i][j];
//                 }
//             }

//             System.out.println(result); 
//         }
//     }
// }
import java.util.Scanner;

public class Two_Dimensional_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                grid[i][j] = sc.nextInt();
       
        int[][][] pre = new int[32][N+1][M+1]; 


        for (int bit = 0; bit < 32; bit++) {

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {

                    int val = ((grid[i-1][j-1] >> bit ) & 1 );

                    pre[bit][i][j] = pre[bit][i-1][j] + pre[bit][i][j-1] - pre[bit][i-1][j-1] + val;
                }
            }
        }
       

        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int result = 0;

            for (int bit = 0; bit < 32; bit++) {
                int cnt = pre[bit][r2][c2] - pre[bit][r1-1][c2] - pre[bit][r2][c1-1] + pre[bit][r1-1][c1-1];
                if (cnt > 0) result |= (1 << bit);
            }

            System.out.println(result);
        }
    }
}
