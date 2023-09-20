/*
    "Half Hollow Pyramid"
    *
     *
      *
    ****
 */

public class HollowHalfPyramid {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int n = 4;

        for (i=1 ; i <= n ; i++){
            if(i==n){
                for(j=1 ; j<=n ; j++){
                    System.out.print("-");
                }
            }else{
                for (j=1 ; j<=i ; j++){
                    if(i==j){System.out.print("\\");}
                    else{System.out.print(" ");}
            }
            }System.out.println();
        }
    }
}
