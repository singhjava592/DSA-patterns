package dsapattern;

public class InsertAtPositionDemo {

    Node head;

    public void insertAtPosition(int data, int position){

        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        for(int i = 1; i <  position -1; i ++){
            current = current.next;
        }
        if(current == null)
            return;
        newNode.next = current.next;
        current.next = newNode;
    }

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
        InsertAtPositionDemo list = new InsertAtPositionDemo();
        list.insertAtEnd(50);
        list.insertAtEnd(40);
        list.insertAtEnd(20);
        list.insertAtEnd(10);
        System.out.println("");
        System.out.println("Before-->");
        list.display();
        list.insertAtPosition(30,3);
        System.out.println("After-->");
        list.display();;

    }
}
