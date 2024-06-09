package Data_Structures.LinkedList;


public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;
    
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;                    // current works as a pointer
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;

        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        size--;
        if (head.next == null) {
            head = null;            // the initial node will be lost and collected by garbage collector
            return; 
        }

        Node secLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secLast = secLast.next;
        }

        last = null;                // collected by garbage collector
        secLast.next = last;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        } System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        
        LL list1 = new LL();
        list1.addFirst("Nikhil");
        list1.addLast("is");
        list1.addFirst("Koshti");
        list1.addLast("Good Boy");
        list1.deleteFirst();
        list1.deleteLast();
        list1.addLast("a");
        list1.addLast("better");
        list1.addLast("programmer");
        list1.printList();
        int size = list1.getSize();
        System.out.println(size);
    }
}
