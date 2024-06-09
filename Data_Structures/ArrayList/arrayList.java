package Data_Structures.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // adding elements
        for (int i = 0; i < 5; i++) {
            list.add(i);                      // adding element to the last index
        }

        System.out.println(list);
        list.add(5, 6);         // adding element by specifying the index
        System.out.println(list);
        list.add(5, 5);         // adding element in between the elements
        System.out.println(list);

        // changing value of specific index
        list.set(1, null);
        System.out.println(list);
        
        // removing/deleting the element
        list.remove(0);
        System.out.println(list);

        // sorting the list
        list.set(0, 1);         // we changed the first element because to sort the list we need all interger values 
        Collections.sort(list);
        System.out.println(list);

        // size of arrayList
        System.out.println("Size of arrayList: " + list.size());

        // get() we can store the specific element in a different variable
        int x = list.get(3);
        System.out.println("Value of x is " + x);
    }
}
