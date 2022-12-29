package offer.tree;

import ExistsClass.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class offer32_1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);

        ArrayList<TreeNode> treeList = new ArrayList<>();
        while (q.size() != 0) {
            TreeNode cur = q.removeFirst();
            treeList.add(cur);
            if (cur.left != null)
                q.addLast(cur.left);
            if (cur.right != null)
                q.addLast(cur.right);
        }
        int size = treeList.size();
        int[] res = new int[size];
        for (int i = 0; i < treeList.size(); i++) {
            res[i] = treeList.get(i).val;
        }
        return res;
    }

    @Test
    public void test(){
        TreeNode root = TreeNode.getTree();
        int[] levelOrder = levelOrder(root);
        for (int i = 0; i < levelOrder.length; i++) {
            System.out.println(levelOrder[i] + ", ");
        }
    }
}
