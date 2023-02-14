package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        //System.out.println("\nLinked List:");
        //myLinkedList.printList();

        myLinkedList.append(2);
        myLinkedList.printList();

        /*
            Expected OUTPUT:
            Head: 4
            Tail: 4;
            Length: 1

            Linked List:
            4
         */
    }
}
