// Find the maximum & minimum number in an array of integers. 
// [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

import java.util.Scanner;

public class HW_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("The maximum number is "+max);
        System.out.println("The minimum number is "+min);
        sc.close();
    }
}
