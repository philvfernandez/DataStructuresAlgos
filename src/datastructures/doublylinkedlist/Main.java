package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        //Has 2 items and returns Node with 2
        System.out.println(myDLL.removeLast().value);

        //Has 1 item and returns Node with 1
        System.out.println(myDLL.removeLast().value);

        //Has 0 items and returns null
        System.out.println(myDLL.removeLast());


    }
}
