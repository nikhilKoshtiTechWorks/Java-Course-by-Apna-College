// Print a palindromic number pyramid.
/*
        1
       212
      32123
     4321234
    543212345
 */

public class Homework5_3 {
    public static void main(String[] args) {
        int n =5;
        for(int i =1; i<=n; i++){
                for(int x =1; x<=n-i; x++){
                    System.out.print(" ");
                }
                for(int x =0; x<i; x++){
                    System.out.print(i-x);
                }
                for(int x=i-1; x>0; x--){
                    System.out.print(i-(x-1));
                }
                System.out.println();
        }
    }
}
