/**
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth
 * is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int L = minDepth(root.left);
        int R = minDepth(root.right);
        return 1 + ((Math.min(L, R) > 0) ? Math.min(L, R) : Math.max(L, R));
    }
}
