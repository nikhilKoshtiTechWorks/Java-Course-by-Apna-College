// Write a program to find if a number is a power of 2 or not.
// Write a program to toggle a bit a position = “pos” in a number “n”.
// Write a program to count the number of 1’s in a binary representation of the number.
// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]

public class HW15_2_toggle {
    
    public static void main(String[] args) {
        int n = 2;
        int pos = 1;
        int bitMask = 1<<pos;
        if((bitMask&n)==0){
            n = n | bitMask;
            System.out.println(n);
        }else{
            int notBitMask = ~bitMask;
            n = n & notBitMask;
            System.out.println(n);
        }



    }
}
