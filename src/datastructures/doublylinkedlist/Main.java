package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

        // 2 Items in list - returns node 2
        System.out.println(myDLL.removeFirst().value);
        // 1 Item in list - returns node 1
        System.out.println(myDLL.removeFirst().value);
        //No items in list - returns null
        System.out.println(myDLL.removeFirst());




    }
}
