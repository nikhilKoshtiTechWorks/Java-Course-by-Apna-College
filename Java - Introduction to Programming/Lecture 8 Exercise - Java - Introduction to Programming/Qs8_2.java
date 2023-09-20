// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class Qs8_2 {

    public static int sumOfAllOddNumbers(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("The sum of odd numbers from 1 to "+n+" is "+sumOfAllOddNumbers(n));
    }
}
