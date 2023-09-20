package Begginer;

import java.util.Scanner;

public class xPowerN {
    
    // Stack height = n
    public static int calculatePower1(int x, int n){
        if(n==0){               // BASE CASE 1
            return 1;
        }

        if(x==0){               // BASE CASE 2
            return 0;
        }
        
        x = x * calculatePower1(x, n-1);     // Operation + Recursion
        return x; 
    }

    // Stack height = log(n)
    public static int calculatePower2(int x, int n){
        if(n==0){               // BASE CASE 1     as last step will be n = 1/2 == 0
            return 1;
        }

        if(x==0){               // BASE CASE 2
            return 0;
        }
        
        // if 'n' is even
        if(n % 2 == 0){
            return calculatePower2(x, n/2) * calculatePower2(x, n/2);
        }
        // if 'n' is odd
        else{
            return calculatePower2(x, n/2) * calculatePower2(x, n/2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the Stack Height: 1. n\t2. log(n)");
        int option = sc.nextInt();
        if(option==1){
            System.out.println(calculatePower1(x, n));
        }
        if(option==2){
            System.out.println(calculatePower2(x, n));
        }else{System.out.println("invalid option");}
        sc.close();
    }
}
