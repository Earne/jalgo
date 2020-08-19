import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree {1,#,2,3},
 * <p>
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * return [3,2,1].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
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


    private List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur;
        TreeNode pre = null;
        boolean isPop = false;
        while (!stack.isEmpty()) {
            cur = stack.peek();
            if (!isPop && stack.peek().left != null) {
                stack.push(cur.left);
            } else {
                isPop = false;
                if (stack.peek().right == null || cur.right == pre) {
                    pre = stack.pop();
                    res.add(pre.val);
                    isPop = true;
                } else {
                    stack.push(stack.peek().right);
                }
            }
        }
        return res;
    }
}
