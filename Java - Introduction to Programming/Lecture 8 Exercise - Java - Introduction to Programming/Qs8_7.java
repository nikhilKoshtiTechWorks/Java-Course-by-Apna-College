// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class Qs8_7 {
    public static void count(){
        Scanner sc = new Scanner(System.in);
        boolean choice = true;
        int zero = 0;
        int positive = 0;
        int negative = 0;
        do{
            System.out.print("Enter your number: ");
            int a = sc.nextInt();
            if (a==0){
                zero++;
            }else if(a>0){
                positive++;
            }else{negative++;}
            System.out.print("Do you want to enter more numbers(y/n): ");
            String x = sc.next();
            //System.out.println(x);
            if(x.equals("n")|| x.equals("no")){choice=false;}
        }while(choice);
        sc.close();
        System.out.println("\nCount is as follows,\n\nZeros\tPositives\tNegatives\n"+zero+"\t"+positive+"\t\t"+negative);
    }
    public static void main(String[] args) {
        count();
    }
}
