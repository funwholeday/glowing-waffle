package ExistsClass;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public static TreeNode root;
    public TreeNode(int x) {
        val = x;
    }


    public static TreeNode getTree() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        return root;
    }
}
