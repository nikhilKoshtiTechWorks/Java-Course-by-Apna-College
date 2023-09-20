/*
    Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    Example : 
    original = “eabcdef’ ; result = “iabcdif”
    Original = “xyz” ; result = “xyz”

 */

import java.util.Scanner;

public class HW_13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder original = new StringBuilder("");
        original.append(sc.nextLine());
        System.out.println(original.length());
        StringBuilder result = new StringBuilder("");

        for(int i = 0; i<original.length(); i++){
            if(original.charAt(i) == 'e'){
                result.append('i');
            }else{
                result.append(original.charAt(i));
            }
        }
        System.out.println("original: "+original+"\nresult: "+result);
        sc.close();
    }
}
