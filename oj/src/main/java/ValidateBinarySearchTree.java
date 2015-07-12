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

    public boolean isValidBST(TreeNode root) {
        helper(root);
        for (int i = 1; i < inOrder.size(); i++) {
            if (inOrder.get(i) <= inOrder.get(i - 1))
                return false;
        }
        return true;
    }

    private void helper(TreeNode node) {
        if (node == null)
            return;
        helper(node.left);
        inOrder.add(node.val);
        helper(node.right);
    }
}
