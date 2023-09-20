/*
    Rotated pyramid by 180 degrees
       *
      **
     ***
    ****

 */

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        
            int i = 1;
            int n = 4;

            for(i=1 ; i<=n ; i++){
                // inner loop --> to print spaces
                for(int j = 1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }
                
                //iner loop --> to print star '*'
                for(int j = 1 ; j<=i ; j++){
                    System.out.print("*");
                }System.out.println();
            }
    }
}
