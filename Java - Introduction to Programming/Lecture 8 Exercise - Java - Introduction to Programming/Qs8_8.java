// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;

public class Qs8_8 {
    public static double calculatePower(double x, double n){
        //this function will not work for n<1 i.e. n=0.5, n=-2, etc.
        double base = x;
        for(double i = 1; i<n; i++){
                base = base*x;
        }    
        return base;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of Base and Power(Enter positive integer): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        System.out.print("The value of "+a+" raised to "+b+" is "+calculatePower(a,b));
        
    }
}
