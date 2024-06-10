package Data_Structures.LinkedList;

import java.util.LinkedList;

public class CollectionLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.addLast(2);
        list.add(3);
        list.addFirst(0);
        list.removeLast();
        list.add(4);
        list.add(3, 5);
        list.add(4, 4);
        list.remove(3);
        list.removeLast();
        list.add(3, 3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("element at index " + 2 + " is " + list.get(2));

    }
}
