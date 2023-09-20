/*
 *  Qs. Place tiles of size (1xm) in a floor of size (nxm)
 *  We have to find out the total ways to place the tiles in particular floor
 *  
 *  BASE CASES:
 *  1. if n==m there are 2 ways. i) all verticle    ii) all horizontal
 *  2. if n<m  there is only 1 way --> all 1xm tiles placed horizontally (there is no other option).
 * 
 *  else:
 *  for n>m
 *  verticle tile >>   n --> n-m
 *  horzontal tile >>  n --> n-1
 * 
 */
package Advance;

public class placementOfTiles {
    public static int placeTile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        // if tile is placed vertically
        int verticle = placeTile(n-m, m);

        // if tile is placed horizontally
        int horizontal = placeTile(n-1, m);

        return verticle + horizontal;           // returns the total ways
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        System.out.println(placeTile(n, m));
    }
}
