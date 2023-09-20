// Make a function to print the table of a given number n.

import java.util.Scanner;

public class Hw7_3 {

    public static void tableOfNumber(int input){
        System.out.println("The table of "+input+" is as follows:");
        for(int i=1; i<=10; i++){
            System.out.println(input*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input number: ");
        int input = sc.nextInt();
        sc.close();
        tableOfNumber(input);
        return;
    }
}
