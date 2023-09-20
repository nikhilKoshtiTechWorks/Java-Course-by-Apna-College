/*
 *  COunt total paths in a maze from (0,0) to (n,m)
 *  Rules: Only rightward and downward move is allowed
 * 
 */
package Advance;

public class mazePathsCount {

    public static int countPaths(int i, int j, int n, int m){

        if(i==n || j==m){
            return 0;                           // as here we are out of bounds from our maze we will return 0
        }
        if(i==(n-1) && j==(m-1)){
            return 1;                           // as we have completed one path to the end cell (n,m) we will return 1
        }
        // downward moves
        int downward = countPaths(i+1, j, n, m);
        
        // rightward paths
        int rightward = countPaths(i, j+1, n, m);

        int count = downward + rightward;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 4, 4));
    }
    
}
