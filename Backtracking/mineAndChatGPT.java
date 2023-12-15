// package Backtracking;

public class mineAndChatGPT {

    public static int knightL(int a, int b, int n, int count, int x, int y){
        count++;
        System.out.println("increment "+count);
        if(a>=(n-1) || b>=(n-1)){
            count--;
            System.out.println("decreament "+count);
            return count;
        }
        if(a == (n-1) && b == (n-1)){
            System.out.println("success "+count);
            return count;
        }

        int[] dx = {a, -a, b, -b};
        int[] dy = {a, -a, b, -b};

        int moves = 0;
        for (int k = 0; k < 8; k++) {
            int nextX = x + dx[k];
            int nextY = y + dy[k];
            moves = knightL(a, b, n, count + 1, nextX, nextY);
        }

        // x = knightL(i, j, a+i, b+j, n, count);       // 4th step
        // x = knightL(i, j, a+i, b-j, n, count);
        // x = knightL(i, j, a-i, b+j, n, count);       // 3rd step
        // x = knightL(i, j, a-i, b-j, n, count);

        // x = knightL(i, j, b+i, a+j, n, count);       // 1st step
        // x = knightL(i, j, b+i, a-j, n, count);       // 2nd step 
        // x = knightL(i, j, b-i, a+j, n, count);
        // x = knightL(i, j, b-i, a-j, n, count);
        
            return moves;
    }
    public static void minimumMoves(int n){
        // int [][] chessBoard = new int[n][n];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
            }
        }
        int result = knightL(1, 2, n, 0, 0, 0);
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n = 5;
        minimumMoves(n);
    }

}
