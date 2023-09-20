// Qs. Identify weather the input is prime or composite


import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        sc.close();
        int i = 2;
        boolean isprime = true;
        for (i=2 ; i<=input/2 ; i++){    
            /*  condition is i<=input/2 because if first half is unable to divide next half can't divide number + 
                for input 2 code will not go in for loop */
            if(input%i == 0){
                isprime = false; 
                break;
            }
        }
            if (isprime){
                if(input == 1){System.out.println("Its neither prime nor composite");}
                else{System.out.println("Its a prime number");}
            }
            else{System.out.println("Its not prime number");}
    }
}
