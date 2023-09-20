/*  Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	    1 : + (Addition) a + b
        2 : - (Subtraction) a - b
        3 : * (Multiplication) a * b
        4 : / (Division) a / b
        5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and display it to the user.
 */
import java.util.Scanner;

public class Homework3_1{
    public static void main(String[] args) {
        System.out.print("Here is Your Calculator\nFirstly enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = 0;

        while(x==0){

            System.out.println("Now enter the Operation you want to perform\n 1. Addition\t2.Subtraction\t3.Multiplication\t4.Division\t5.Modulo\t6.Exit");
            int button = sc.nextInt();
            if(button<=6){

                switch(button){
                    case 1 : System.out.println(a+b);
                    break;
                    case 2 : System.out.println(a-b);
                    break;
                    case 3 : System.out.println(a*b);
                    break;
                    case 4 : 
                    if(b==0) {
                                System.out.println("Invalid Division");
                                } else {
                                    System.out.println(a/b);
                                }break;
                    case 5 : 
                    if(b==0) {
                                System.out.println("Invalid Division");
                                } else {
                                    System.out.println(a%b);
                                }break;
                    default :
                    x = 1; 
                    System.out.println("Successfully Exited");
                }

            }else{System.out.println("Invalid input");}
            
            
        }
        sc.close();

        
    }
}