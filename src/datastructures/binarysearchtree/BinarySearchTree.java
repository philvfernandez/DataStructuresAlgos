package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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

    private Node deleteNode(Node currentNode, int value) {
        //Base case
        if(currentNode == null) return null;

        if(value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if(value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            /*
            found the value we are looking for but in one of the following specific cases:
              1) What we are trying to delete is a leaf node.
              2) There is a node on the right but not the left.
              3) There is a node on the left but not the right.
              4) Or there is a node on each side, right and left.
             */

            //Case #1 - Deleting a leaf node
            if(currentNode.left == null && currentNode.right == null) {
                return null;
            } else if(currentNode.left == null) { //Case #2 - There is a node on the right but not the left.
                currentNode = currentNode.right;
            } else if(currentNode.right == null) { //Case #3 - There is a node on the left but not the right.
                currentNode = currentNode.left;
            } else { //Case #4 - There is a node on each side, right and left.
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right,subTreeMin);
            }
        }
        return currentNode;
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }

    class Node {
        int value;
        Node left;
        Node right;


        private Node(int value) {
            this.value = value;
        }

    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);

        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse { //Java hack to have a method inside of a method.
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if(currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }


}
