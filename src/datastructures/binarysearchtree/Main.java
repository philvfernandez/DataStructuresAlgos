package datastructures.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        /* myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        myBST.deleteNode(2); */

        /*
               3
              / \
             1  null
         */
        /* System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right); */

        //BFS
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        //System.out.println(myBST.BFS());

        //DFS - PreOrder
        System.out.println(myBST.DFSPreOrder());

    }
}
