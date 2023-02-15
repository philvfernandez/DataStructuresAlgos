package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);
        //myDLL.printList();


        myDLL.prepend(1);
        myDLL.printList();



    }
}
