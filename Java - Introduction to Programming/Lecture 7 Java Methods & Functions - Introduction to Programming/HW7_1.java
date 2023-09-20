/*
    Make a function to check if a number is prime or not.
    Read about Recursion.
 */

import java.util.Scanner;

public class HW7_1 {

    public static void isPrime(int a){
        boolean isPrime = true;
        for(int i = 2; i<=a/2; i++){
            if(a%i==0){
                isPrime = false;
            }else{isPrime = true;}
        }
        if(a==1){
            System.out.println("Given input is neither prime nor composite.");
        }else if(isPrime){
            System.out.println(a+" is a prime number.");
        }else{System.out.println(a+" is not a prime number.");}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = sc.nextInt();
        sc.close();
        isPrime(input);
    }
}
