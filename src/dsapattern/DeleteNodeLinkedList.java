package dsapattern;

public class DeleteNodeLinkedList {

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

    public void deleteAtPosition(int position){

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        // delete first node or postion =1
        if(position == 1){
            head = head.next;
            return;
        }

         Node current = head;

        for(int i = 1; i< position -1 && current != null; i ++){
            current = current.next;
        }

        // invalid postion
        if(current == null || current.next == null){
            System.out.println("Invalid Position");
            return;
        }

        current.next = current.next.next;

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
        DeleteNodeLinkedList list = new DeleteNodeLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.print("Before deletion  ");
        list.display();
        list.deleteAtPosition(3);

        System.out.print("After deletion  ");
        list.display();

    }
}
