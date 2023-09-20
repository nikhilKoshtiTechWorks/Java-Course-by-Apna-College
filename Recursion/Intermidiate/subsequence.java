package Intermidiate;
// For unique we added new datatype called HashSet
import java.util.HashSet;

public class subsequence {
    public static void printsubsequences(int i, String str, String newStr, HashSet<String> set){         // every newStr stores one subsequence

        if(i==str.length()){                        // prints subsequence as we have reached to last char
            if(set.contains(newStr)){               // checks weather it is there is the HashSet or not
                return;
            }
            else{
                System.out.println(newStr);
                set.add(newStr);                    // adds newStr to our HashSet could be use for next cheking 
                return;
            }
        }

        char currChar = str.charAt(i);

        // char To Be printed
        printsubsequences(i+1, str, newStr+currChar, set);
        // char Not To Be printed
        printsubsequences(i+1, str, newStr, set);           //     here we can write newStr+"_" for our convinience but it won't work 
        //printsubsequences(i+1, str, newStr+"_", set);     //     for unique subsequences
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        printsubsequences(0, "abc", "", set);
    }
}
