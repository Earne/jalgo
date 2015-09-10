import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 二叉树的层次遍历
 * 给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）
 * 样例
 * <p/>
 * 给出一棵二叉树 {3,9,20,#,#,15,7},
 * <p/>
 * 3
 * <p/>
 * / \
 * <p/>
 * 9  20
 * <p/>
 * /  \
 * <p/>
 * 15   7
 * <p/>
 * 返回它的层次遍历为：
 * <p/>
 * [
 * <p/>
 * [3],
 * <p/>
 * [9,20],
 * <p/>
 * [15,7]
 * <p/>
 * ]
 * 挑战
 * <p/>
 * 只使用一个队列去实现它
 */
public class BinaryTreeLevelOrderTraversal {
    /**
     * @param root: The root of binary tree.
     * @return Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        ArrayList<Integer> cur = new ArrayList<>();
        cur.add(root.val);

        while (!queue.isEmpty()) {
            res.add(new ArrayList<>(cur));
            int size = queue.size();
            cur.clear();
            while (size-- != 0) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                    cur.add(queue.peek().left.val);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                    cur.add(queue.peek().right.val);
                }
                queue.remove();
            }

        }

        return res;
    }
}
