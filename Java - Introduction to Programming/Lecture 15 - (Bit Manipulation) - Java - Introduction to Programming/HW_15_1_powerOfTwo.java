import java.util.Scanner;

public class HW_15_1_powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int temp = input;
        while(temp != 1 && temp%2==0){      // the modulo of our variable should be 0 beacause for power of 2 its always zero && as temp becomes 1 we need to check condition and get out of loop
            temp /=2;
        }
        if(temp==1){
            System.out.println(input+" is a power of 2");
        }else{System.out.println(input+" is not a power of 2");}
        sc.close();    
    }
}
