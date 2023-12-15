// package Backtracking;

public class codeByChatGPT {
    public static int knightL(int x, int y, int n, int count, int[][] chessboard) {
        if (x < 0 || x >= n || y < 0 || y >= n || chessboard[x][y] != 0) {
            return -1; // Invalid move or cell already visited.
        }
        if (count == n * n) {
            return count; // Successfully visited all cells.
        }

        int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        chessboard[x][y] = count;

        int minMoves = -1;

        for (int k = 0; k < 8; k++) {
            int nextX = x + dx[k];
            int nextY = y + dy[k];
            int moves = knightL(nextX, nextY, n, count + 1, chessboard);
            if (moves != -1 && (minMoves == -1 || moves < minMoves)) {
                minMoves = moves;
            }
        }

        chessboard[x][y] = 0; // Backtrack by resetting the cell.

        return minMoves;
    }

    public static void minimumMoves(int n) {
        int[][] chessboard = new int[n][n];
        int result = knightL(0, 0, n, 1, chessboard);

        if (result == -1) {
            System.out.println("No valid tour found.");
        } else {
            System.out.println("Minimum moves required: " + result);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        minimumMoves(n);
    }
}
