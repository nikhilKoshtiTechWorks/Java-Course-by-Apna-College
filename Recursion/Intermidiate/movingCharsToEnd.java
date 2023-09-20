package Intermidiate;
public class movingCharsToEnd {

    public static String newStr = "";                               // making new String to print final output
    public static void moveXToEnd(int i, String str, int count){
        // BASE CASE
        if(i==str.length()){

            for(int x = 0; x<count; x++){                   // adding 'x' for count times
                newStr = newStr + 'x';
            }
            System.out.println(newStr);
            return;

        }

        // Checking condition
        if(str.charAt(i) == 'x'){
            count++;                                        // if current char is 'x' then increasing the count
            moveXToEnd(i+1, str, count);                    // recursion for next char
        } else{
            newStr = newStr + str.charAt(i);                // else adding the current char to new String
            moveXToEnd(i+1, str, count);                    // recursion for next char
        }
    }
    public static void main(String[] args) {
        moveXToEnd(0, "axhxsbkxg", 0);
    }
}
