package datastructures.doublylinkedlist;

import datastructures.linkedlist.LinkedList;
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

    public void prepend(int value) {
        //create new node
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {

        //List is empty
        if(length == 0) {
            return null;
        }
        Node temp = head;
        //When we have 1 item in the linked list.
        if(length == 1) {
            head = null;
            tail = null;
        } else { //Two or more items in the Linked list.
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if(index < length/2) {
            for (int i = 0;i<index;i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1;i > index;i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
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
