package offer.tree;

import ExistsClass.TreeNode;
import org.junit.Test;

import java.util.HashMap;

public class offer07 {

    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) return null;

        //中序结果写map，方便定位root的位置，k=节点，v=下标索引
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return help(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode help(int[] preorder, int left, int right, int[] inorder, int left2, int right2) {
        //递归退出条件
        if(left > right || left2 > right2)
            return null;

        int rootVal = preorder[left];
        TreeNode root = new TreeNode(rootVal);
        Integer rootIdx = map.get(rootVal);
        /*
        根据左右子树节点的个数确定，rootIdx是中序遍历中root节点的idx，那么idx左边的就是左子树的节点个数，idx右边的就是右子树的节点个数
        左子树中左右指针的确定:rootIdx - 1 - right2 + 1 = X - (left + 1) + 1  -> X = rootIdx-left2+left
        左子树中左右指针的确定:right2 - (rootIdx + 1) + 1 = right - X + 1 -> X = right + rootIdx + 1 - right2
         */
        root.left = help(preorder, left+1, rootIdx-left2+left, inorder, left2, rootIdx-1);
        root.right = help(preorder, right - right2 + rootIdx+1, right, inorder, rootIdx+1, right2);
        return root;
    }


    @Test
    public void test(){
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        buildTree(preorder, inorder);
    }
}
