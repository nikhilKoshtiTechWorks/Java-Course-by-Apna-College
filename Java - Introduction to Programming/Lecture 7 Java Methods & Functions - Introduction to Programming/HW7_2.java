//Make a function to check if a given number n is even or not.

import java.util.Scanner;

public class HW7_2 {

    public static void isEven(int input){
        if(input%2==0){
            System.out.println(input+" is a even number");
        }else{System.out.println(input+" is not a even number");}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = sc.nextInt();
        sc.close();
        isEven(input);
    }
}
