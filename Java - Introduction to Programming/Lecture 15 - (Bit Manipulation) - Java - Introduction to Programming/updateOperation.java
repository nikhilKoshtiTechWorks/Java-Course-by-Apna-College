// Logic is same as SET and CLEAR

import java.util.Scanner;

public class updateOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        int n = 5;
        int position = 2;

        if(operation==1){
            // SET
            int bitMask = 1<<position;
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else if(operation == 0){
            // CLEAR
            int bitMask = 1<<position;
            int notBitMask = ~bitMask;
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
