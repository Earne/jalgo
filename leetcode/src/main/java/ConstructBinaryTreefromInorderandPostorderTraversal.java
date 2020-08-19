import java.util.Stack;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * <p>
 * Note:
 * You may assume that duplicates do not exist in the tree.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        return buildTree1(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree1(int[] inorder, int inBeg, int inEnd, int[] postorder, int pBeg, int pEnd) {
        if (inEnd < inBeg || pEnd < pBeg)
            return null;
        TreeNode root = new TreeNode(postorder[pEnd]);
        int rootIndexInInOrder = findRootIndexInInOrder1(inorder, postorder[pEnd]);
        int leftSize = rootIndexInInOrder - inBeg;
        root.left = buildTree1(inorder, inBeg, inBeg + leftSize - 1, postorder, pBeg, pBeg +
                leftSize - 1);
        root.right = buildTree1(inorder, rootIndexInInOrder + 1, inEnd, postorder, pBeg + leftSize,
                pEnd - 1);
        return root;
    }

    private int findRootIndexInInOrder1(int[] inorder, int value) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    // TODO refactor this

    // TODO add iterative solution

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int ip, int iq, int[] postorder, int pp, int pq) {
        if (ip >= iq) {
            return null;
        }
        if (pp >= pq) {
            return null;
        }
        int rootVal = postorder[pq - 1];
        TreeNode root = new TreeNode(rootVal);
        int rootPosInInorder = findRootInInorder(rootVal, inorder, ip, iq);
        int leftLength = rootPosInInorder - ip;
        root.left = buildTree(inorder, ip, rootPosInInorder, postorder, pp, pp + leftLength);
        root.right = buildTree(inorder, rootPosInInorder + 1, iq, postorder, pp + leftLength, pq - 1);
        return root;
    }

    private int findRootInInorder(int rootVal, int[] inorder, int ip, int iq) {
        for (int i = ip; i < iq; i++) {
            if (inorder[i] == rootVal) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public TreeNode buildTreeIterative(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) return null;
        int ip = inorder.length - 1;
        int pp = postorder.length - 1;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode prev = null;
        TreeNode root = new TreeNode(postorder[pp]);
        stack.push(root);
        pp--;

        while (pp >= 0) {
            while (!stack.isEmpty() && stack.peek().val == inorder[ip]) {
                prev = stack.pop();
                ip--;
            }
            TreeNode newNode = new TreeNode(postorder[pp]);
            if (prev != null) {
                prev.left = newNode;
            } else if (!stack.isEmpty()) {
                TreeNode currTop = stack.peek();
                currTop.right = newNode;
            }
            stack.push(newNode);
            prev = null;
            pp--;
        }

        return root;
    }
}
