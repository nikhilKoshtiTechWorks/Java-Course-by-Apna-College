public class sudokoSolver {

    public static boolean isSafe(char[][] board, int row, int col, int number) {
        for(int i = 0; i<board.length; i++){
            // chacking the row and column
            if(board[i][col] == (char)(number+'0')){
                return false;
            }
            // chacking the column
            if(board[row][i] == (char)(number+'0')){
                return false;
            }
        }

        // for finding the grid first

        int x = (row/3) * 3;
        int y = (col/3) * 3;

        // cell(x,y) is the starting point of the grid

        // Now checking in the grid

        for(int i = x; i < x+3; i++){
            for(int j = y; j < y+3; j++){
                if(board[i][j] == (char)(number+'0')){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        
        if(row == board.length-1 && col == board.length-1){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board.length; j++){
                    System.out.print(board[i][j]+" ");
                }System.out.println();
            }
            return true;
        }
        int nrow = 0;
        int ncol = 0;

        // Iteration to travel on the sudoko board
        if(col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        // Checking the place is blank or not
        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)){
            return true;
            }
        } else {
            // Fill the place
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i+'0');            // converting int i to char using (char)(i+'0') as i+'0' = 'i'
                    if(helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        char[][] board = {  {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        helper(board, 0, 0);
    }
}