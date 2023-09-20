/*
    Pattern no.1             
    1
    01
    010
    1010
    10101

    Pattern no. 2
    1
    01
    101
    0101
    10101
*/

import java.util.Scanner;

public class one_zero_triangle {
    public static void main(String[] args) {
        int n= 5;
        System.out.println("Pattern no.1\tPattern no.2 by apna college");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.close();
        
        if(option==1){
            boolean x = true;
            for (int i = 1 ; i<=n ; i++){
                for(int j= 1 ; j<=i ; j++){
                    if(x){
                        System.out.print("1");
                        x = false;
                    }else{System.out.print("0"); x=true;}
                }System.out.println();
            }
        }
        else{
            for (int i = 1 ; i<=n ; i++){
                for(int j= 1 ; j<=i ; j++){
                    int sum = i+j;
                    if(sum%2==0){
                        System.out.print("1");
                    }else{System.out.print("0");}
                }System.out.println();
            }
        }
    }
}
