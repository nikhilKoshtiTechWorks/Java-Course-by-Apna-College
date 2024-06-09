package Data_Structures.ArrayList;

import java.util.ArrayList;

public class arrayListSize {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        
        int x = list.get(0) + 5;
        System.out.println(x);
        
        ArrayList<Integer> al = new ArrayList<>(5);     // this initialCapacity will just reserve the memory 
        System.out.println(al.size());
        al.add(45);
        System.out.println(al.size());
        al.add(35);
        System.out.println(al.size());
    }
}
