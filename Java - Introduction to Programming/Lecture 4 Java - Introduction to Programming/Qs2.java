// Qs. 2 Print the table of a number input by user.

import java.util.Scanner;

public class Qs2 {
    public static void main(String[] args) {
     //Qs. 2
            System.out.print("Enter the number: ");
            Scanner sc1 = new Scanner(System.in);
            int m = sc1.nextInt();
            
            int j = 1;
            int mul = 1;
            
            while (mul<m*10){
                mul = j*m;
                System.out.println(mul);
                j++;
            }
            sc1.close();
    }
}
