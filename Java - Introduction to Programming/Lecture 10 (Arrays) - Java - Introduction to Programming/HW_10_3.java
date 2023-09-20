/*
    Take an array of numbers as input and check if it is an array sorted in ascending order.
        Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

 */

import java.util.Scanner;

public class HW_10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();                    // if size == 4 last index is 3

        int numbers[] = new int[size];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        // logic for ascending orderand descending order
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++){      // here i<4-1 i.e. i<3 it will go till index 2 means third number of array
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
                break;
            }
        }

        System.out.print("{");
        for(int i=0; i<numbers.length; i++){
            if(i!=size-1){System.out.print(numbers[i]+", ");
        }else{System.out.print(numbers[i]+"}");}
        }
    if(isAscending){
        System.out.print(" is sorted in ascending order.");
    }else{System.out.print(" is not sorted in ascending order.");}
        sc.close();
    }
}
