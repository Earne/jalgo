/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * <p>
 * Recover the tree without changing its structure.
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
 */
public class RecoverBinarySearchTree {
    TreeNode p, q, pre;

    public void recoverTree(TreeNode root) {
        helper(root);
        int tmp;
        tmp = q.val;
        q.val = p.val;
        p.val = tmp;
    }

    private void helper(TreeNode node) {
        if (node == null)
            return;
        helper(node.left);
        if (pre == null)
            pre = node;
        if (p == null && pre.val > node.val)
            p = pre;
        if (p != null && pre.val > node.val)
            q = node;
        pre = node;
        helper(node.right);
    }

    // TODO add Morris Traversal solution
}
