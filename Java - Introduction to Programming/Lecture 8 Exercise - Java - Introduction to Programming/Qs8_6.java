// Write an infinite loop using do while condition.

import java.util.Scanner;

public class Qs8_6 {

    public static void infiniteLoop(){
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("1. remain in the loop\t2. get out of loop\nEnter choice: ");
            int a = sc.nextInt();
            if(a==2){b=false;}else{b=true;}
        }while(b);
        sc.close();
    }

    public static void main(String[] args) {
        infiniteLoop();
    }
}
