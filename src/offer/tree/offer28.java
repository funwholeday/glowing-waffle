package offer.tree;

import ExistsClass.TreeNode;
import org.junit.Test;

public class offer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return rec(root.left, root.right);
    }

    private boolean rec(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        //判断这个left和right当前节点值是否相同，并且left和right的左右子树必须是对称的，也就是说：
        // left.right = right.left
        // left.left = right.right

        //left.val == right.val可以放在上面的if中，提前返回，效率更高
        return left.val == right.val && rec(left.left, right.right) && rec(left.right, right.left);
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        System.out.println(isSymmetric(root));
    }
}
