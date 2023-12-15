// package Backtracking;

public class chessBoardKnightL {
    public static int knightL(int i, int j, int a, int b, int n, int count){
        count++;
        System.out.println("increment "+count);
        if(a>=(n-1) || b>=(n-1)){
            count--;
            System.out.println("decreament "+count);
            return count;
        }
        if(a == (n) && b == (n)){
            System.out.println("success "+count);
            return count;
        }
        int x = count;
        x = knightL(i, j, a+i, b+j, n, count);       // 4th step
        x = knightL(i, j, a+i, b-j, n, count);
        x = knightL(i, j, a-i, b+j, n, count);       // 3rd step
        x = knightL(i, j, a-i, b-j, n, count);

        x = knightL(i, j, b+i, a+j, n, count);       // 1st step
        x = knightL(i, j, b+i, a-j, n, count);       // 2nd step 
        x = knightL(i, j, b-i, a+j, n, count);
        x = knightL(i, j, b-i, a-j, n, count);
        
            return x;
    }
    public static void minimumMoves(int n){
        // int [][] chessBoard = new int[n][n];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
            }
        }
        int result = knightL(1, 1, 0, 0, n, -1);
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n = 5;
        minimumMoves(n);
    }
}
