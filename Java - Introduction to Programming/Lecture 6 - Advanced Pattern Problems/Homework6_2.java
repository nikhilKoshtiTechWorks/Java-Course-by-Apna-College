// Hollow Rhombus

public class Homework6_2 {
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
            }
            for(int j =1; j<=n; j++){
                if(i==1 || i==n || j ==1 || j==n){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }
            // for(int j = 0; j<=i-1; j++){
            //         System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
