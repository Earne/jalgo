import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by earne on 9/16/15.
 */
public class FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> helpStack = new Stack<>();
        stack.push(root);
        helpStack.push(root.val);
        int tmp = stack.peek().val;
        while (!stack.isEmpty()) {
            if (stack.peek().left != null) {
                helpStack.push(stack.peek().left.val);
                stack.push(stack.peek().left);
                tmp += stack.peek().val;
            } else if (stack.peek().right != null) {
                helpStack.push(stack.peek().right.val);
                stack.push(stack.peek().right);
                tmp += stack.peek().val;
            } else {
                if (tmp == target)
                    res.add(new ArrayList<Integer>(helpStack));
                tmp -= stack.peek().val;
                stack.pop();
                helpStack.pop();
            }
        }
        return res;
    }
}
