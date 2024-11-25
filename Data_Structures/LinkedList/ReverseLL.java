package Data_Structures.LinkedList;


public class ReverseLL {
    Node head;
    private int size;

    ReverseLL() {
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
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        } System.out.println("NULL");
    }

    public void addInBetween(int index, String data) {
        Node newNode = new Node(data);
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node previous = head;
        Node current = head.next;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                newNode.next = current;
                previous.next = newNode;
            }
            previous = previous.next;
            current = current.next;
        }
        size++;
    }

    public void removeInBetween(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node preNode = head;
        Node current = head.next;
        Node nxtNode = current.next;

        for (int i = 1; i < size; i++) {
            if (index == i) {
                preNode.next = nxtNode;
                current = null;
                size--;
                return;
            }
            preNode = preNode.next;
            current = current.next;
            nxtNode = nxtNode.next;
        }
    }

    public int getSize() {
        return size;
    }

    public void iterativeReverseLL() {

        Node currNode = head;
        Node preNode = null;
        
        while (currNode != null) {
            Node tempNode = currNode.next;      // this node is collected by the Java Garbage Collector after each iteratio execution. So no effet on Space complexity
            currNode.next = preNode;
            preNode = currNode;
            currNode = tempNode;
        }
 
        head = preNode;
    }

    public Node recursiveReverseLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = recursiveReverseLL(head.next);       // this will return last node and will return it in every recursive call

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        
        ReverseLL list1 = new ReverseLL();    

        list1.addFirst("a");
        list1.addFirst("b");
        list1.addFirst("c");
        // list1.addFirst("d");
        // list1.addFirst("e");

        list1.printList();

        list1.iterativeReverseLL();
        list1.printList();

        list1.head = list1.recursiveReverseLL(list1.head);
        list1.printList();

    }
}
