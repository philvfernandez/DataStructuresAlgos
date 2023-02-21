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

    /*
    Steps:
    //root -> null
    if(root == null) return false
    temp = root
    while(temp != null)
      if < left
      else if > right
      else == return true

    //temp == null
    return false
     */
    public boolean contains(int value) {
        //if(root == null) return false; //Not as clean as this step is not really needed.
        Node temp = root;
        while(temp != null) {
            if(value < temp.value) {
                temp = temp.left;
            } else if(value > temp.value) {
                temp = temp.right;

            } else { //if value is equal to node value in tree
                return true;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if(currentNode == null) return false;

        if(currentNode.value == value) return true;

        if(value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    //Method overloading - same method name but different arguments passed to the method.
    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        //base case
        if(currentNode == null) return new Node(value);

        //recursive case
        if(value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }

        //pointer to existing node with value
        return currentNode;
    }

    public void rInsert(int value) {
        //edge case to insert into an empty tree.
        if(root == null) root = new Node(value);

        rInsert(root, value);
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
