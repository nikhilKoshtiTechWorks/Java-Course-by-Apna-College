// Qs. 1 Print the sum of first n numbers.

import java.util.Scanner;

public class Qs1 {
    public static void main(String[] args) {
        // Qs. 1 
                        System.out.print("Enter the value of 'n': ");
                        Scanner sc = new Scanner(System.in);
                        int n = sc.nextInt();
                        
                        int sum = 0;
                        
                        int i = 0;
                        while (i<=n){
                            sum = sum+i;
                            i++;
                        }
                        System.out.println(sum);
                        sc.close();
    }
}
