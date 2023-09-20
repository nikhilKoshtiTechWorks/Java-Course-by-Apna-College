/*
    Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    Example : 
    original = “eabcdef’ ; result = “iabcdif”
    Original = “xyz” ; result = “xyz”

 */
import java.util.Scanner;

public class HW_12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String result = "";
        System.out.println(result.length());

        for(int i = 0; i<original.length(); i++){
            if(original.charAt(i) =='e'){
                result = result + 'i';
            }else{
                result = result + original.charAt(i);
            }
        }
        System.out.println(result.length());
        sc.close();
    }
}