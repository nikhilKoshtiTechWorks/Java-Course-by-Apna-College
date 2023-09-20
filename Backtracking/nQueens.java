package Backtracking;

import java.util.*;

public class nQueens {
    public static boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j = 0; j<board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // verticle
        for(int j=0; j<board.length; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }

        // upper left (row and col both decreases)
        int r = row;
        for(int c = col; r>=0 && c>=0; c--, r--){       // here && is added to avoid the condition (0,-1) as -1 < 0 result of true && false = false : it will check the next condition for upper right
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper right (row decrease & col increase)
        r = row;
        for(int c = col; c<board.length && r>=0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower left (row increase & col decrease)
        r = row;
        for(int c = col; c>=0 && r<board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right (row and col both increases)
        r = row;
        for(int c = col; c<board.length && r<board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
        
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards){
        String row = "";
        List <String> newBoards = new ArrayList<>(0);

        for(int i = 0; i<board.length; i++){
            row = "";
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 'Q'){
                    row = row + "Q";
                } else {
                    row = row + ".";
                }
            }
            newBoards.add(row);
        }
        allBoards.add(newBoards);
    }
    public static void helper(char[][] board, List<List<String>> allBoards, int col){
        if(col == board.length){                        // actual condition is col == n
            saveBoard(board, allBoards);
            return;
        }
        for(int row = 0; row<board.length; row++){      // actual condition is row == n
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
