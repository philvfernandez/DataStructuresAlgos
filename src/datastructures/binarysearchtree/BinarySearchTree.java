package datastructures.binarysearchtree;

public class BinarySearchTree {
    public Node root;

    /* public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public BinarySearchTree() {
        root = null;
    } */

    class Node {
        int value;
        Node left;
        Node right;


        private Node(int value) {
            this.value = value;
        }

    }

}
