/**
 * 前序遍历和中序遍历树构造二叉树
 * 根据前序遍历和中序遍历树构造二叉树.
 * 样例
 * <p/>
 * 给出中序遍历：[1,2,3]和前序遍历：[2,1,3]. 返回如下的树:
 * <p/>
 * 2
 * / \
 * 1   3
 * <p/>
 * 注意
 * <p/>
 * 你可以假设树中不存在相同数值的节点
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    /**
     * @param preorder : A list of integers that preorder traversal of a tree
     * @param inorder  : A list of integers that inorder traversal of a tree
     * @return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)
            return null;
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBeg, int inEnd) {
        if (preBegin > preEnd || inBeg > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preBegin]);
        int rootInInorder = rootInInorder(inorder, inBeg, inEnd, preorder[preBegin]);
        int leftSize = rootInInorder - inBeg;
        root.left = helper(preorder, preBegin + 1, preBegin + leftSize, inorder, inBeg, rootInInorder - 1);
        root.right = helper(preorder, preBegin + leftSize + 1, preEnd, inorder, rootInInorder + 1, inEnd);
        return root;
    }

    private int rootInInorder(int[] inorder, int inBeg, int inEnd, int target) {
        for (int i = inBeg; i <= inEnd; i++) {
            if (inorder[i] == target)
                return i;
        }
        throw new IllegalArgumentException();
    }
}
