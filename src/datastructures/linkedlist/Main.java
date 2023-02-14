package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        //Creates Link List with values of 2 and 1.
        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.set(1, 4);
        myLinkedList.printList();




    }
}
