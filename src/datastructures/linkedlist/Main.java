package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        //Creates Link List with values of 2 and 1.
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println(myLinkedList.get(2).value);
        myLinkedList.printList();



    }
}
