package Begginer;

public class factorial {

    public static int fact(int n){
        if(n==0 || n==1){               // BASE CASE
            return 1;
        }
        
        int fact_nm = fact(n-1);  // Recursion (fact_nm stands for factorial of n minus 1)

        int fact_n = n*fact_nm;         // Operation
        return fact_n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
