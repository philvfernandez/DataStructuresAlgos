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

    /*
    Pseudo code:
    create newNode
    if root == null then root = new Node
    temp = root
    while loop
      if newNode == temp return false -->> duplicate
      if < left else > right
      if null insert newNode else move to next
     */
    public boolean insert(int value) {
        Node newNode = new Node(value); //create new node

        if(root == null) { //empty tree
            root = newNode;
            return true;
        }
        Node temp = root;

        while(true) {
            if(newNode.value == temp.value) return false;

            if(newNode.value < temp.value) { //go left if true
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;

            } else { //go right if true
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    class Node {
        int value;
        Node left;
        Node right;


        private Node(int value) {
            this.value = value;
        }

    }

}
