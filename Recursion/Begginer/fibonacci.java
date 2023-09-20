package Begginer;


public class fibonacci{

    public static void fibonacciSequence(int n, int first, int second){
        if(n==0){
            return;
        }

        int third = first + second;
        System.out.print(third+" ");
        fibonacciSequence(n-1, second, third);
    }
    public static void main(String[] args) {
        int n = 6;
        int first = 0;
        int second = 1;
        if(n==1){System.out.print(first+" ");}
        else if(n==2){
            System.out.print(first+" ");
            System.out.print(second+" ");
        }else{
            System.out.print(first+" ");
            System.out.print(second+" ");
            fibonacciSequence(n-2, first, second);
        }
    }
}