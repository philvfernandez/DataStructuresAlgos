package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        //Creates Link List with values of 2 and 1.
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // Removes first node on list - 2
        System.out.println(myLinkedList.removeFirst().value);

        // Removes first node on list - 1
        System.out.println(myLinkedList.removeFirst().value);

        // Removes first node list - Empty list so returns null
        System.out.println(myLinkedList.removeFirst());

    }
}
