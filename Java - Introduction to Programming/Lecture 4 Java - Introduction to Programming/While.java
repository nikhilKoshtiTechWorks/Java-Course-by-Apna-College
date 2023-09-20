// Qs. 1 Print the sum of first n numbers.
// Qs. 2 Print the table of a number input by user.

import java.util.Scanner;

public class While {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = 0;

            while(x==0){

                System.out.println("Qs. 1 Print the sum of first n numbers.\nQs. 2 Print the table of a number input by user.\nSelect your Question\n1. Qs. 1\t2. Qs. 2\t3. Exit");

                int option = sc.nextInt();
                
                while(option<4){
                    
                    if (option == 1){
            
                        // Qs. 1 
                        System.out.print("Enter the value of 'n': ");
                        int n = sc.nextInt();
                        
                        int sum = 0;
                        
                        int i = 0;
                        while (i<=n){
                            sum = sum+i;
                            i++;
                        }
                        System.out.println("Answer is:"+"____"+ sum +"____\n");
                        option = 4;
                        //sc.close();
                        
                    }
                    else if(option == 2) {
                        
                        //Qs. 2
                        System.out.print("Enter the number:");
                        int m = sc.nextInt();
                        System.out.println("Table is as follows:\n");
                        
                        int j = 1;
                        int mul = 1;
                        
                        while (mul<m*10){
                            mul = j*m;
                            System.out.println(mul);
                            j++;
                        }
                        System.out.print("\n");
                        option = 4;
                    } 
                    else{
                        option = 4;
                        x = 1;
                        System.out.println("Exited Successfully");
                    }
                    
                    
                } 
                //System.out.println("Invalid Input");
            }
            sc.close();
    }
}
