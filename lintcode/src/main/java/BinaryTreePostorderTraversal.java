import java.util.ArrayList;

/**
 * 二叉树的后序遍历
 * 给出一棵二叉树，返回其节点值的后序遍历.
 * 样例
 * <p/>
 * 给出一棵二叉树 {1,#,2,3},
 * <p/>
 * 1
 * \
 * 2
 * /
 * 3
 * <p/>
 * 返回 [3,2,1]
 * 挑战
 * <p/>
 * 你能使用非递归实现么？
 */
public class BinaryTreePostorderTraversal {
    /**
     * @param root: The root of binary tree.
     * @return Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    private void helper(ArrayList<Integer> res, TreeNode root) {
        if (root == null)
            return;
        helper(res, root.left);
        helper(res, root.right);
        res.add(root.val);
    }
}
