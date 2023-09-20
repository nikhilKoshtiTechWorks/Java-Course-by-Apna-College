/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
(BONUS) */

import java.util.Scanner;

public class Qs8_10 {

    public static void fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        for(int i = 2; i<=n; i++){
            System.out.print(b+" ");
            int c = a+b;
            a = b;
            b = c;
        }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        sc.close();
        fibonacciSeries(n);

    }
}
