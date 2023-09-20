// Qs.Print all even numbers till n.

import java.util.Scanner;

public class Homework4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 2;

        for (i=2 ; i<=n ; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

    }
}
