import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * For example:
 * Given the following binary tree,
 * <p>
 * 1            <---
 * /   \
 * 2     3         <---
 * \     \
 * 5     4       <---
 * <p>
 * You should return [1, 3, 4].
 */
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        Queue<TreeNode> pre = new LinkedList<TreeNode>();
        Queue<TreeNode> cur = new LinkedList<TreeNode>();
        pre.add(root);

        while (!pre.isEmpty()) {
            if (pre.size() == 1)
                result.add(pre.peek().val);
            if (pre.peek().left != null)
                cur.add(pre.peek().left);
            if (pre.peek().right != null)
                cur.add(pre.peek().right);
            pre.poll();
            if (pre.isEmpty()) {
                pre = cur;
                cur = new LinkedList<TreeNode>();
            }
        }
        return result;
    }
}
