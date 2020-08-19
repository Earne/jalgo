import java.util.Stack;

/**
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals the given sum.
 * For example:
 * Given the below binary tree and sum = 22,
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \      \
 * 7    2      1
 * <p>
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class PathSum {
    boolean result = false;
    int sum;

    public boolean hasPathSum(TreeNode root, int sum) {
        this.sum = sum;
        helper(root, 0);
        return result;
    }

    public void helper(TreeNode node, int cur) {
        if (result || node == null)
            return;
        cur += node.val;
        helper(node.left, cur);
        helper(node.right, cur);
        if (node.left == null && node.right == null && cur == sum) {
            result = true;
        }
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return root.val == sum;
        return (hasPathSum2(root.left, sum - root.val) || hasPathSum2(root.right, sum - root.val));
    }

    public boolean hasPathSum3(TreeNode root, int sum) {
        if (root == null) {
            return sum == 0;
        }
        return hasPathSum3(root.left, sum - root.val) || hasPathSum3(root.right, sum - root.val);
    }

    public boolean hasPathSum4(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, root.val));
        while (!stack.isEmpty()) {
            Pair peek = stack.pop();
            TreeNode node = peek.node;
            if (node.left == null && node.right == null) {
                if (peek.curSum == sum) {
                    return true;
                }
            }
            if (node.right != null) {
                stack.push(new Pair(node.right, peek.curSum + node.right.val));
            }
            if (node.left != null) {
                stack.push(new Pair(node.left, peek.curSum + node.left.val));
            }
        }
        return false;
    }

    class Pair {
        TreeNode node;
        int curSum;
        public Pair(TreeNode node, int val) {
            this.node = node;
            this.curSum = val;
        }
    }

}
