

public class Homework5_1 {
    // Actually the question is to print Rhombus but I improvised the question and printed 'Z' and "7" by putting if conditions
    // remove the if conditions to get thr solid rhombus
    
    public static void main(String[] args) {
        int n = 7;
        for(int i = 1; i<=n; i++){
            if(i<n/2){
                for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }    
            }else{
                for(int j = 1; j<=n-i; j++){
                    System.out.print(" ");
                }
            }
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            if(i>n/2+1){
                for(int j = 0; j<=i-1; j++){
                System.out.print("*");
            }    
            }else{
                for(int j = 0; j<=i-1; j++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
