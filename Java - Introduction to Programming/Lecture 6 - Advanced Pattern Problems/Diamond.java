public class Diamond {
    public static void main(String[] args) {
        int n = 4;

        //This is using palindromic pattern

        /*for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=n-1; i>=1; i--){           // int i=n for actual question but this case is for perfect diamond
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            for(int j=2; j<=i; j++){        
                System.out.print("*");
            }System.out.println();
        }*/

        // This is with its own logic
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=n-1; i>=1; i--){          // int i=n for actual question but this case is for perfect diamond
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){    // logic to print stars no. of stars = i*2-1
                System.out.print("*");
            }System.out.println();
        }
    }
}
