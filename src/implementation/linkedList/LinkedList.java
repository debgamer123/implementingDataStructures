package implementation.linkedList;

public class LinkedList {
    int noOfElement=0;
    Node head;
    Node tail;
    public void add( Integer newElement){
        if(noOfElement==0){
            createNewLinkedList(newElement);
        }else {
            Node newNode = new Node(newElement,null);
            tail.setNext(newNode);
            tail = newNode;
            noOfElement++;
        }
    }
    public void createNewLinkedList(Integer newElement){
        final Node firstElement = head;
        Node newNode = new Node(newElement,firstElement);
        head = newNode;
        tail = head;
        noOfElement++;
    }
    public class Node {
        int data;

        public int getData() {
            return this.data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext(){
            return this.next;
        }

        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node next;
    }

    public Node getHead() {
        return head;
    }
}
