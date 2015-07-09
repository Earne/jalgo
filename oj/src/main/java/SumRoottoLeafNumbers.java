/**
 * Given a binary tree containing digits from 0-9 only,
 * each root-to-leaf path could represent a number.
 * <p>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p>
 * Find the total sum of all root-to-leaf numbers.
 * <p>
 * For example,
 * <p>
 * 1
 * / \
 * 2   3
 * <p>
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * <p>
 * Return the sum = 12 + 13 = 25.
 */
public class SumRoottoLeafNumbers {
    int result = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        helper(root, root.val);

        return result;
    }

    public void helper(TreeNode node, int current) {
        if (node.left == null && node.right == null) {
            result += current;
            return;
        }
        if (node.left != null)
            helper(node.left, current * 10 + node.left.val);
        if (node.right != null)
            helper(node.right, current * 10 + node.right.val);
    }
}
