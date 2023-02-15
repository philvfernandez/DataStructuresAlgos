package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(11);
        myDLL.append(3);
        myDLL.append(23);
        myDLL.append(7);

        myDLL.set(1, 4);

        myDLL.printList();

    }
}
