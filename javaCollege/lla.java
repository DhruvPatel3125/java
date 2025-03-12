import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
// singly linked list
class SinglyLinkedList{
    node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            System.out.println("Node inserted as the first node with value: " + data);
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Node inserted with value: " + data);
        }
        
    }
}