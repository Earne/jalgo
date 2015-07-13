/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int pBeg, int pEnd, int[] inorder, int inBeg, int inEnd) {
        if (pBeg > pEnd || inBeg > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[pBeg]);
        int rootIndexInInOrder = findRootInInOrder(inorder, preorder[pBeg]);
        int leftSize = rootIndexInInOrder - inBeg;
        root.left = buildTree(preorder, pBeg + 1, pBeg + leftSize,
                inorder, inBeg, rootIndexInInOrder - 1);
        root.right = buildTree(preorder, pBeg + leftSize + 1, pEnd,
                inorder, rootIndexInInOrder + 1, inEnd);
        return root;
    }

    private int findRootInInOrder(int[] inorder, int value) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }
}
