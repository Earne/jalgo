import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int result = 0;
        TreeNode current;
        stack.push(root);
        TreeNode pre = null;
        while (!stack.empty()) {
            current = stack.peek();
            if (pre == null
                    || pre.left == current
                    || pre.right == current) {
                if (current.left != null)
                    stack.push(current.left);
                else if (current.right != null)
                    stack.push(current.right);
            } else if (current.left == pre) {
                if (current.right != null)
                    stack.push(current.right);
            } else {
                stack.pop();
            }

            pre = current;
            result = (result > stack.size()) ? result : stack.size();
        }
        return result;
    }
}
