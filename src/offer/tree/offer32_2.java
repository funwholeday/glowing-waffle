package offer.tree;

import ExistsClass.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            //注意这里不能写for (int i = 0; i < queue.size(); ++i), 原因在于每次for循环中，都会往queue里添加元素，下一次执行判断queue.size时，就变了
            for (int i = queue.size(); i > 0; --i) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    @Test
    public void test(){
        TreeNode tree = TreeNode.getTree();
        List<List<Integer>> lists = levelOrder(tree);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
