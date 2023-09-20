// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

import java.util.Scanner;

public class HW_15_4_conversions {

    public static int powerOfTwo(int a, int b){  // writng this function to avoid the use of Math.pow(double a, double b)
        int x = a;
        if(b==0){
            return 1;
        }else{
            for(int i=1; i<b; i++){
                a = x*a;
            }
        }return a;
    }


    public static void decimalToBinary(int n){
        int x = 0;
        while(n>=Math.pow(2, x)){
            x++;                    // logic to create an array of size of nth power of 2 going to use to set the array size
        }

        int array[] = new int[x];   // declared the array of desired size

        for(int i = 0; i<x && n>0; i++){
            array[i] = n%2;                 // stored the bit values in our array
            n/=2;
        }

        for(int j=x-1; j>=0; j--){          // for loop to print the array in reverse fashion
            System.out.print(array[j]);
        }System.out.println();
    }


    public static void binaryToDecimal(String n){
        int value = 0;
        int x = 0;
        for(int i = n.length()-1; i>=0; i--){
            int bitMask = n.charAt(i) - '0';       // converting character to numeric value

            if(bitMask == 1){                      // cheking wether the bit is '1' or '0'. If its '1' then add the xth power of 2 in value
                value = value + powerOfTwo(2, x);
            }x++;                                   // maintaining the power of 2 by variable 'x'
        }System.out.println(value);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int number = sc.nextInt();
        decimalToBinary(number);
        System.out.print("Enter the binary number: ");
        String binary = sc.next();
        binaryToDecimal(binary);
        sc.close();
    }
}
