package dsapattern;

public class LinkedListDemo {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        //n1--> n2-->n3-->n4

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node head = n1;
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}
