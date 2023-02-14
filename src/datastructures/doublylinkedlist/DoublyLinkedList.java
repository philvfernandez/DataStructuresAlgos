package datastructures.doublylinkedlist;

import org.w3c.dom.Node;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;


    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);

        //Empty linked list
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {

        //When we have no items in the list
        if (length == 0) {
            return null;
        }

        Node temp = tail;
        //When we have only one item in the list.
        if(length == 1) {
            head = null;
            tail = null;
        } else { //When we have two or more items in the list.
            tail = tail.prev;
            tail.next = null;
            tail.prev = null;
        }
        length--;
        return temp;
    }

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }
}
