public class ll {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            size++;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addlst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

        public int removeFirst(){
            if(head == null){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(head == tail){
                int val = head.data;
                head = tail = null;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val; 
        }
    public static void main(String args[]) {
        ll LinkedList = new ll();
        LinkedList.print();
        LinkedList.addFirst(2);
        LinkedList.print();
        LinkedList.addFirst(1);
        LinkedList.print();
        LinkedList.addlst(3);
        LinkedList.print();
        LinkedList.addlst(4);
        LinkedList.print();
        LinkedList.add(2, 56);
        LinkedList.print();
    }
}
