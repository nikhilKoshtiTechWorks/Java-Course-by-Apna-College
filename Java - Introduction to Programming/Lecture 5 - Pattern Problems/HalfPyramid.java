/*
   'HalfPyramid' 
    *
    **
    ***
    ****
 */

public class HalfPyramid {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 4;

        for(i=1 ; i<=n ; i++){
            for(j=1 ; j<=i ; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
