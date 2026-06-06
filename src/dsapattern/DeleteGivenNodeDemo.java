package dsapattern;

public class DeleteGivenNodeDemo {

    Node head;
    public static void deleteNode(Node node){
        if(node == null || node.next == null)
            return ;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void display(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        DeleteGivenNodeDemo deleteGivenNodeDemo = new DeleteGivenNodeDemo();

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.print("Before delete");
        deleteGivenNodeDemo.display(n1);
        deleteNode(n3);
        System.out.print("After delete");
        deleteGivenNodeDemo.display(n1);
    }
}
