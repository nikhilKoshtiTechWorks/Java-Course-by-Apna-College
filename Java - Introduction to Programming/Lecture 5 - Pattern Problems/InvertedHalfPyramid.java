/*
    Inverted Pyramid
    
    ****
    ***
    **
    *
 */

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int i = 1;
        int n = 4;
        i = n ; 
        for (i=n ; i>=1 ; i--){
            for (int j=1 ; j<=i ; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
