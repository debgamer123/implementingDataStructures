import implementation.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        LinkedList.Node temp = linkedList.getHead();
        while (temp != null){
            System.out.print(temp.getData()+ " ");
            temp = temp.getNext();
        }
    }
}