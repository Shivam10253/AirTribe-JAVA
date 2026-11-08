package LinkedList;

public class basicsLL {
    public static class Node{
        int data; // value
        Node next; // address of next node

        // constructor
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        // System.out.println(a.data); // 5
        // System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 -> 3 -> 9 -> 8 -> 16

        a.next = b; // 5 -> 3  9 8 16
        // System.out.println(a.next); // LinkedList.basicsLL$Node@251a69d7
        // System.out.println(b); // LinkedList.basicsLL$Node@251a69d7

        // System.out.println(b.data);
        // System.out.println(a.next.data);








        // System.out.println(x); //LinkedList.basicsLL$Node@3d8314f0
        // System.out.println(x.data);
        // System.out.println(x.next);
    }
}