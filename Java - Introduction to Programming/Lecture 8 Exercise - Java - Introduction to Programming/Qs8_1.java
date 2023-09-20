// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Qs8_1 {
    public static int calculateAverage(int a, int b, int c){
        int avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("Average of inputs is: "+calculateAverage(a,b,c));

    }
}
