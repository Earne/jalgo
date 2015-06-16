import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3

return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal {
    List<Integer> result = new ArrayList<Integer>();
    public List<Integer> postorderTraversal1(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode node) {
        if (node == null) return;
        helper(node.left);
        helper(node.right);
        result.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode pre = null;
        TreeNode cur = root;
        s.push(cur);
        if (root == null) return result;

        while (!s.isEmpty()) {
            cur = s.peek();
            if (pre == null || pre.left == cur || pre.right == cur) {
                if (cur.left != null)
                    s.push(cur.left);
                else if (cur.right != null)
                    s.push(cur.right);
                else {
                    result.add(cur.val);
                    s.pop();
                }
            } else if (cur.left == pre) {
                if (cur.right != null)
                    s.push(cur.right);
                else {
                    result.add(cur.val);
                    s.pop();
                }
            } else if (cur.right == pre) {
                result.add(cur.val);
                s.pop();
            }

            pre = cur;
        }
        return result;
    }
}
