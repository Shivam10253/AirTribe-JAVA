package LinkedList;

public class basicsLL {

    // creating a method to display a linkedlist
    public static void displayLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // creating a Node Class
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
        Node f = new Node(58);
        // 5 -> 3 -> 9 -> 8 -> 16 [This is what we want.]

        a.next = b; // 5 -> 3  9 8 16
        // System.out.println(a.next); // LinkedList.basicsLL$Node@251a69d7
        // System.out.println(b); // LinkedList.basicsLL$Node@251a69d7

        // System.out.println(b.data);
        // System.out.println(a.next.data);

        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16

        e.next = f;

        // System.out.println(d.next.data);
        // System.out.println(e.next);

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        // Node temp = a;
        // for (int i = 0; i < 5; i++) { // we use for-loop because we know the no. of elements
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }


        // we use while-loop because we dont know how many times we have to iterate
        // Node temp = a;
        // while (temp != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }


        displayLL(a); // a is our head node.




        // System.out.println(x); //LinkedList.basicsLL$Node@3d8314f0
        // System.out.println(x.data);
        // System.out.println(x.next);
    }
}