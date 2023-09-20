package Begginer;

public class sumOfNNaturalNumbers {

    // My Logic
    // This logic can't work for sum of integers as our BASE CASE stops at n=1
    public static void sumOfNaturalNumbers(int n, int sum){
        
        if(n==0){                           // BASE CASE
            System.out.println(sum);
            return;
        }
        sum += n;                           // operation: maintaining variable 'sum'
        
        sumOfNaturalNumbers(n-1, sum);      // Recursion
    }

    // Shradhha Didi's Logic
    // This logic is perfect for sum of interger eg. i = -3 to n = 5 as BASE CASE compares i & n
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;                   // avoids the extra layer in stact for i==n+1
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int i = -1;
        int n = 5;
        int sum = 0;
        // sumOfNaturalNumbers(n, sum);
        printSum(i, n, sum);

    }
}
