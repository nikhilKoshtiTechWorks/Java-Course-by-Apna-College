// Write a function which takes in 2 numbers and returns the greater of those two.

/*

Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS)

 */

import java.util.Scanner;

public class Qs8_3 {

    public static void greaterNumber(int a, int b){
        if(a>b){
            System.out.println(a);
        }else if(b>a){System.out.println(b);}
        else {System.out.println("Numbers are equal.");}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        greaterNumber(a, b);

    }
}
