/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int inBeg, int inEnd, int[] postorder, int pBeg, int pEnd) {
        if (inEnd < inBeg || pEnd < pBeg)
            return null;
        TreeNode root = new TreeNode(postorder[pEnd]);
        int rootIndexInInOrder = findRootIndexInInOrder(inorder, postorder[pEnd]);
        int leftSize = rootIndexInInOrder - inBeg;
        root.left = buildTree(inorder, inBeg, inBeg + leftSize - 1, postorder, pBeg, pBeg +
                leftSize - 1);
        root.right = buildTree(inorder, rootIndexInInOrder + 1, inEnd, postorder, pBeg + leftSize,
                pEnd - 1);
        return root;
    }

    private int findRootIndexInInOrder(int[] inorder, int value) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    // TODO refactor this
}
