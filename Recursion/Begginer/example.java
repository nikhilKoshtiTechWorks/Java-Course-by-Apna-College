package Begginer;

public class example {
    public static void printNums(int n){

        if(n==6){           // BASE CASE
            return;
        }
        
        
        System.out.println(n);      // Step taken by Outer Function


        printNums(n+1);             // Recursion

    }
    public static void main(String[] args) {
        int n = 1;
        printNums(n);
    }
}
