import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 * <p/>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * <p/>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p/>
 * return its zigzag level order traversal as:
 * <p/>
 * [
 * [3],
 * [20,9],
 * [15,7]
 * ]
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null)
            return res;
        Stack<TreeNode> curStack = new Stack<TreeNode>();
        boolean rightOrder = true;
        curStack.push(root);

        while (!curStack.isEmpty()) {
            Stack<TreeNode> nextStack = new Stack<TreeNode>();
            List<Integer> tmp = new ArrayList<Integer>();
            while (!curStack.isEmpty()) {
                tmp.add(curStack.peek().val);
                if (rightOrder) {
                    if (curStack.peek().left != null)
                        nextStack.push(curStack.peek().left);
                    if (curStack.peek().right != null)
                        nextStack.push(curStack.peek().right);
                } else {
                    if (curStack.peek().right != null)
                        nextStack.push(curStack.peek().right);
                    if (curStack.peek().left != null)
                        nextStack.push(curStack.peek().left);
                }
                curStack.pop();
            }
            curStack = nextStack;
            rightOrder = !rightOrder;
            res.add(tmp);
        }
        return res;
    }
}
