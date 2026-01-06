package RamdomQuestions;

public class Nqueen {
    public static void main(String[] args) {
        
    int n = 4;
            char[][] board = new char[n][n];

            // initialize board
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = '.';
                }
            }

            placeQueen(0, n, board);

    }


    public static void placeQueen(int row , int n , char[][] board){

           if (row == n) {
            // print board
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("------");
            return;
        }


       for (int col = 0; col < n; col++) {

            if (isSafe(row, col, board)) {
                board[row][col] = 'I';

                placeQueen(row + 1, n, board);

                board[row][col] = '.';
            }
        }
    }


        static boolean isSafe(int row, int col, char[][] board) {

       
        // for (int i = 0; i < row; i++) {
        //     if (board[i][col] == 'Q') return false;
        // }

       
        // for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        //     if (board[i][j] == 'Q') return false;
        // }

      
        // for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        //     if (board[i][j] == 'Q') return false;
        // }


        
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'I') return false;
        }


        for (int j = col-1; j >= 0;  j--) {
            if (board[row][col] == 'I') return false;
        }

        return true;
    }
}
