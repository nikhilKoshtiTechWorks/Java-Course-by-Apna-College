package Data_Structures.LinkedList.LeetCode;

public class swapPair {
    int size;
    ListNode head;
    class ListNode {
        int val;
        ListNode next;
        ListNode() {size = 0;}
        ListNode(int val) { this.val = val; size = 0; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; size = 0; }
    }

    public void add(int data) {
        size++;
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;                    // current works as a pointer
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        } System.out.println("NULL");
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode node = dummy;
            while (node.next != null) {
                ListNode first = node.next;
                if (first.next == null) {
                    break;
                }
                ListNode second = first.next;

                if (second.next == null) {
                    second.next = first;
                    first.next = null;
                    node.next = second;
                }
                else {
                ListNode secondNext = second.next;
                second.next = first;
                node.next = second;
                first.next = secondNext;
                }
                node = first;
            }
            return dummy.next;
        }

    }
    public static void main(String[] args) {
        swapPair list = new swapPair();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        

        list.printList();

        list.head = list.swapPairs(list.head);

        list.printList();
    }
}
