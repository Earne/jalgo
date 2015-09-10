/**
 * Created by earne on 9/9/15.
 */
public class MirrorOfBinaryTree {
    public TreeNode mirrorOfBinaryTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode tmp = root.left;
        root.left = mirrorOfBinaryTree(root.right);
        root.right = mirrorOfBinaryTree(tmp);
        return root;
    }
}
