package dsapattern;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class IterativePreOrder {

    static void preOrder(TreeNode root){

        if(root == null ) return ;

        Stack<TreeNode> stack  = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            System.out.print(current.val + " ");
            // right
            if(current.right != null){
                stack.push(current.right);
            }
            //left
            if(current.left != null){
                stack.push(current.left);
            }
        }

    }

    static void preOrderRecursive(TreeNode root){
        if(root == null ) return ;
        System.out.print(root.val + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    static void inOrderRecursive(TreeNode root){
        if(root == null ) return ;
        preOrderRecursive(root.left);
        System.out.print(root.val + " ");
        preOrderRecursive(root.right);
    }

    static void postOrderRecursive(TreeNode root){
        if(root == null ) return ;
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(14);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
       // preOrder(root);
        System.out.println("********");
        preOrderRecursive(root);
        System.out.println(" ");
        inOrderRecursive(root);
        System.out.println(" ");
        postOrderRecursive(root);
    }

    // visti current
    // trsverse to my left
  //   traverse to my right
}
