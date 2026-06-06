package dsapattern;

public class InsertAtEnd {

    Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        // if list is empty
        if(head == null){
            head = newNode;
            return ;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();;
    }

}
