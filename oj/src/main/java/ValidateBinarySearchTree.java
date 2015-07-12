import java.util.ArrayList;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * Assume a BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    ArrayList<Integer> inOrder = new ArrayList<Integer>();

    public boolean isValidBST2(TreeNode root) {
        helper2(root);
        for (int i = 1; i < inOrder.size(); i++) {
            if (inOrder.get(i) <= inOrder.get(i - 1))
                return false;
        }
        return true;
    }

    private void helper2(TreeNode node) {
        if (node == null)
            return;
        helper2(node.left);
        inOrder.add(node.val);
        helper2(node.right);
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, TreeNode min, TreeNode max) {
        return (node == null) || !(min != null && node.val <= min.val) && !(max != null && node.val
                >= max.val) && helper(node.left, min, node) && helper
                (node.right, node, max);
    }
}
