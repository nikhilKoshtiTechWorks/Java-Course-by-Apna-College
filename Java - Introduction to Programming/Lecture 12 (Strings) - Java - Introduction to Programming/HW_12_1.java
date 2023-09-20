// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class HW_12_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        for(int i = 0; i<size; i++){
            array[i] = sc.next();
        }
        int length = 0;
        for(int i = 0; i<size; i++){
            length = length  + array[i].length();
        }
        System.out.print(length);
        sc.close();
    }
}
