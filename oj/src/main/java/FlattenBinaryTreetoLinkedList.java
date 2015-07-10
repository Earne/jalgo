/**
 * Given a binary tree, flatten it to a linked list in-place.
 * <p>
 * For example,
 * Given
 * <p>
 * 1
 * / \
 * 2   5
 * / \   \
 * 3   4   6
 * <p>
 * The flattened tree should look like:
 * <p>
 * 1
 * \
 * 2
 * \
 * 3
 * \
 * 4
 * \
 * 5
 * \
 * 6
 * <p>
 * click to show hints.
 * Hints:
 * <p>
 * If you notice carefully in the flattened tree,
 * each node's right child points to the next node of a pre-order traversal.
 */
public class FlattenBinaryTreetoLinkedList {
    private TreeNode pre = null;

    public void flatten2(TreeNode root) {
        if (root == null)
            return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = null;

        if (pre == null)
            pre = root;
        else {
            pre = pre.right = root;
        }

        flatten2(left);
        flatten2(right);
    }

    // post order solution (right left node)
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);

        root.right = pre;
        root.left = null;
        pre = root;
    }

    // TODO add iterative solution
}
