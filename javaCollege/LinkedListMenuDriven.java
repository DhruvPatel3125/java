import java.util.Scanner;

class SinglyLinkedList {
    // Node class representing a single node in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
//check all code in java linked list go
    private Node head = null;

    // Method to create a linked list
    public void create(int data) {
        head = new Node(data);
        System.out.println("Linked list created with the first node having value: " + data);
    }

    // Method to insert a node at the end of the linked list add
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Node inserted as the first node with value: " + data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Node inserted with value: " + data);
        }
    }

    // Method to delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("The list is empty. No nodes to delete.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Node with value " + data + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node with value " + data + " not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Node with value " + data + " deleted.");
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked list: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListMenuDriven {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Singly Linked List Operations ---");
            System.out.println("1. Create List");
            System.out.println("2. Insert Node");
            System.out.println("3. Delete Node");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value of the first node: ");
                    int firstNodeValue = scanner.nextInt();
                    list.create(firstNodeValue);
                    break;

                case 2:
                    System.out.print("Enter the value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    break;

                case 3:
                    System.out.print("Enter the value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
