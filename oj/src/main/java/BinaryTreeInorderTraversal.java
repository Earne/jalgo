import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3

return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = root;
        while (current != null || !s.empty()) {
            if (current != null) {
                s.push(current);
                current = current.left;
            } else {
                result.add(s.peek().val);
                current = s.peek().right;
                s.pop();
            }
        }

        return result;
    }
}
