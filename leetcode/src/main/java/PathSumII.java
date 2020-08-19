import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * For example:
 * Given the below binary tree and sum = 22,
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \    / \
 * 7    2  5   1
 * <p>
 * return
 * <p>
 * [
 * [5,4,11,2],
 * [5,8,4,5]
 * ]
 */
public class PathSumII {
    public List<List<Integer>> pathSum2(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper2(root, sum, new ArrayList<Integer>(), result);
        return result;
    }

    private void helper2(TreeNode node, int curSum, List<Integer> cur, List<List<Integer>> result) {
        if (node == null)
            return;

        cur.add(node.val);

        if (node.left == null && node.right == null && curSum == node.val) {
            result.add(new ArrayList<Integer>(cur));
        } else {
            helper2(node.left, curSum - node.val, cur, result);
            helper2(node.right, curSum - node.val, cur, result);
        }

        cur.remove(cur.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        helper(root, new ArrayList<Integer>(), result, sum);
        return result;
    }

    private void helper(TreeNode node, ArrayList<Integer> path, List<List<Integer>> result, int
            left) {
        path.add(node.val);
        if (node.left == null && node.right == null)
            if (left == node.val)
                result.add(new ArrayList<Integer>(path));

        if (node.left != null)
            helper(node.left, path, result, left - node.val);
        if (node.right != null)
            helper(node.right, path, result, left - node.val);

        path.remove(path.size() - 1);
    }


    public List<List<Integer>> pathSum3(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        List<Integer> path = new ArrayList<>();
        while (!stack.isEmpty()) {
            Pair peek = stack.pop();
            TreeNode node = peek.node;

        }
        return result;
    }

    class Pair {
        TreeNode node;
        int level;

        public Pair(TreeNode node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
