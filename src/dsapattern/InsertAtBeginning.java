package dsapattern;

public class InsertAtBeginning {

    Node head;

    public void insertAtBeginning(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
        InsertAtBeginning list = new InsertAtBeginning();
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();;
    }
}
