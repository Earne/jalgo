import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *  \
 *   2
 *  /
 * 3
 *
 * return [1,2,3].
 *
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null || !s.isEmpty()) {
            if (current != null) {
                result.add(current.val);
                if (current.right != null)
                    s.push(current.right);
                current = current.left;
            } else {
                current = s.peek();
                s.pop();
            }
        }
        return result;
    }
}
