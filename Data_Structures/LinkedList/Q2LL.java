// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

package Data_Structures.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;


public class Q2LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        String option;

        do {
            System.out.print("Enter the numbers in the range of 1-50: ");
            list.add(sc.nextInt());
            System.out.print("Do you want to add more numbers(y/n): ");
            option = sc.next();
        }while(option.equals("yes") || option.equals("y") || option.equals("Yes") || option.equals("YES"));

        
        System.out.println("List before operation: " + list);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
                
        System.out.println("List after operation: " + list);
        sc.close();

    }
}
