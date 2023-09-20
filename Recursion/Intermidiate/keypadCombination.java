package Intermidiate;
// Print keypad combination of classic nokia phone
/*
 *  0 --> .
 *  1 --> abc
 *  2 --> def
 *  3 --> ghi
 *  4 --> jkl
 *  5 --> mno
 *  6 --> pqrs
 *  7 --> tu
 *  8 --> vwx
 *  9 --> yz
 * 
 *  Time Complexity = 1^n or 2^n or 3^n or 4^n
 *  where, n is length of input String
 *         1 is for 0 --> "."
 *         2 is for 7 --> "tu", 9 --> "yz"
 *         3 is for 1, 2, 3, 4, 5, 8
 *         4 is for 6 
 * 
 * For O() we consider worst case i.e. 4
 * 
 *  Therfore, Time Complexity = O(4^n)
 */

public class keypadCombination {

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno","pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombinations(String str, int i, String combination){
        // BASE CASE
        if(i==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(i);
        String map = keypad[currChar-'0'];          // accessing the keypad array using index = currChar-'0' eg. '2'-'0' = 2

        for(int x = 0; x<map.length(); x++){
            printKeypadCombinations(str, i+1, combination+map.charAt(x));   // adding those chars to recusion layer
        }
    }

    public static void main(String[] args) {
        printKeypadCombinations("26", 0, "");
    }
}
