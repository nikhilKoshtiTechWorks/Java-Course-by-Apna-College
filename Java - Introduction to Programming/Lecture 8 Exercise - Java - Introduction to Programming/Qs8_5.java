// Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class Qs8_5 {

    public static String eligibilityToVote(int age){
        if(age>=1){
            if(age>18){
                return "Your are Eligible for voting"; 
            }else{return "You're not eligible for voting";}
        }else{return"Invalid input";}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        System.out.println(eligibilityToVote(age));
    }
}
