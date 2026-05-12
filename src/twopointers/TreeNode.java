package twopointers;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right ;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(10,null,null);
        root.left = new TreeNode(5,null,null);
        root.right = new TreeNode(14,null,null);

        root.left.left = new TreeNode(2,null,null);
        root.left.right = new TreeNode(7,null,null);
    }

    //root node 10  L- 5 and right - 14
     // 5  L2 anmd R 7
}
