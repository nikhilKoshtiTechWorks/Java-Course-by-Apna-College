package Advance;

import java.util.Scanner;


public class permutation{

    public static int printPermutations(String str, String permutation, int count){
        if(str.equals("")){                 // when the str is null or blank all letters are there in the String permutation 
            System.out.println(permutation);         // so print it and return the function
            count++;
            return count;
        }

        for(int i=0; i<str.length(); i++){                                                          // eg. i = 1
            char currChar = str.charAt(i);                                                          // currChar = 'b'
            // now we are creating new String which excludes the currChar
            // by making subStrings from Strat 0 to i and i+1 to end of String
            String newStr = str.substring(0, i) + str.substring(i+1, str.length());      // newStr = "a" + "b"
            count = printPermutations(newStr, permutation+currChar, count);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str1 = scan.next();
        System.out.println("The Permutations are as follows,");
        int count =printPermutations(str1, "", 0);
        System.out.print("The total permutations are: "+count);
        scan.close();
    }
}