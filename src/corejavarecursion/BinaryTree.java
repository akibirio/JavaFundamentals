package corejavarecursion;

/**
 * class Node
 * class containing left and right child of current node and key value
 */

 class Node{
    int data;
    Node left, right;

    Node(int data){  // will be instantiated to create BinaryTree Nodes
        this.data = data;
        left = null;
        right = null;
    }

 }

 /**
 * class BinaryNode
 * 
 */
public class BinaryTree {
    // root of the tree
    Node root;

    //BinaryTree constructor
    BinaryTree(){
        root = null;
    }

    //Given a binary tree, prints its nodes inorder: 
    // left, print data, right
    public void printInorder(Node node){
        if(node == null){
            return;
        }

        // first recur on the left
        printInorder(node.left);
        
        // then print the data
        System.out.print(node.data + " ");

        // lastly recur in the right
        printInorder(node.right);

    }

    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    // left, right, print data
    public void printPostOrder(Node node) {

        if(node == null){
            return;
        }

        // first recur left
        printPostOrder(node.left);

        // then recur right
        printPostOrder(node.right);

        // last print the node data
        System.out.print(node.data + " ");
        
    }


    /* Given a binary tree, print its nodes in preorder*/
    // print node data, left, right
    public void printPreOrder(Node node) {

        if(node == null){
            return;
        }

        //print node's data
        System.out.print(node.data + " ");

        //recur left node
        printPreOrder(node.left);

        //lastly recure right node
        printPreOrder(node.right);
        
    }

    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder(tree.root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder(tree.root);
    }



    
}



// Complexity Analysis:

// Time Complexity: O(n)
// Auxiliary Space: If we don’t consider size of stack for function calls then O(1) otherwise O(n).