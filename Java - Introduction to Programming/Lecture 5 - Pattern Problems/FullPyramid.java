public class FullPyramid {
    public static void main(String[] args) {
            int i = 1;
            int n = 5;   // number of rows i.e. number of floors

            for(i=1 ; i<=n ; i++){
                // inner loop --> to print spaces
                for(int j = 1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }
                
                //iner loop --> to print star '*'
                for(int j = 1 ; j<=i ; j++){
                    System.out.print("*");
                }

                //iner loop --> to print next star '*'
                for(int j = 1 ; j<=i-1 ; j++){
                    System.out.print("*");
                }

                // inner loop --> to print next spaces 
                for(int j = 1 ; j<=n-i ; j++){
                    System.out.print(" ");
                }System.out.println();
            }
    }
}
