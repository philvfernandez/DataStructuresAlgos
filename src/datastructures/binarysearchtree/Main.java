package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            The Lines ABOVE CREATE THIS TREE:
                        2
                       / \
                      1   3
         */

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);
    }
}
