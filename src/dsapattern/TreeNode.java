package dsapattern;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right ;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(14);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
    }

    //root node 10  L- 5 and right - 14
     // 5  L2 anmd R 7
    // recursion
}
