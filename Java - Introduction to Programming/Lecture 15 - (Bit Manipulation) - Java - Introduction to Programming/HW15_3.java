// Write a program to count the number of 1’s in a binary representation of the number.
public class HW15_3 {
    public static int notBinaryLogic(int n) {
        int c = 0;
        while(n>0){
            if(n%2==1){
                c++;
                n/=2;
            }else{n/=2;}
        }
        return c;
    }

    public static int binaryLogic(int n) {
        int c = 0;
        while(n>0){
            if((n&1)==1){
                c++;
                n = n >> 1;
            }else{n = n >> 1;}
        }return c;
    }
    public static void main(String[] args) {
        int input = 15;
        System.out.println(binaryLogic(input)+" "+notBinaryLogic(input));
        // notBinaryLogic(6);
        // binaryLogic(input);
        
    }
}
