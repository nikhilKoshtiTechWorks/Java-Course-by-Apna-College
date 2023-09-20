// Take an array of StringBuilder input from the user & find the cumulative (combined) length of all those strings.

import java.util.Scanner;

public class HW_13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder[] abc=new StringBuilder[50];
        System.out.print("Enter Size of Array :");
        int size = sc.nextInt();

        // StringBuilder abc[] = new StringBuilder[size];
        // for (int i = 0; i < abc.length; i++) {
        //     abc[i] = sc.nextString();
        // }


        StringBuilder str[] = new StringBuilder[size];
        // str[0]= "xyjs";
        //System.out.println(str[1]);
        for (int i = 0; i < size; i++) {
            // String s = sc.nextLine();
            // str[i] = "";
            str[i].append(sc.nextLine());
        }
        System.out.println(str[0]);
        // StringBuilder strb [] = new StringBuilder[size];
        // for(int i = 0; i<size; i++){
        //     strb[i] = str[i];
        //     System.out.println(strb);

        // }
        for(int i = 0; i< size; i++){
            System.out.println(str[i]);
        }

        sc.close();
    }
}
