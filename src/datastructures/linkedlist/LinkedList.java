package datastructures.linkedlist;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    //Inner/nested class
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


}
