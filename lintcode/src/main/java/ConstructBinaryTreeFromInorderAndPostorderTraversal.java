/**
 * 中序遍历和后序遍历树构造二叉树
 * 根据中序遍历和后序遍历树构造二叉树
 * 样例
 * <p/>
 * 给出树的中序遍历： [1,2,3] 和后序遍历： [1,3,2]
 * <p/>
 * 返回如下的树：
 * <p/>
 * 2
 * <p/>
 * /  \
 * <p/>
 * 1    3
 * 注意
 * <p/>
 * 你可以假设树中不存在相同数值的节点
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     * @param inorder   : A list of integers that inorder traversal of a tree
     * @param postorder : A list of integers that postorder traversal of a tree
     * @return root: Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int inBeg, int inEnd, int[] postorder, int postBeg, int
            postEnd) {
        if (inBeg > inEnd || postBeg > postEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootInInOrder = findRootIndexInInOrder(inorder, inBeg, inEnd, root.val);

        root.left = helper(inorder, inBeg, rootInInOrder - 1,
                postorder, postBeg, postBeg + rootInInOrder - 1 - inBeg);
        root.right = helper(inorder, rootInInOrder + 1, inEnd,
                postorder, postBeg + rootInInOrder - inBeg, postEnd - 1);
        return root;
    }

    private int findRootIndexInInOrder(int[] inorder, int inBeg, int inEnd, int val) {
        for (int i = inBeg; i <= inEnd; i++) {
            if (inorder[i] == val)
                return i;
        }

        throw new IllegalArgumentException();
    }
}
