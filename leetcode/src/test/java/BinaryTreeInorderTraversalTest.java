import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Created by earne on 6/11/15.
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void testInorderTraversal() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree tree = new BinaryTree(a1);
        Integer[] r1 = {1, 3, 2};

        Integer[] a2 = {1, 2, 3};
        BinaryTree tree2 = new BinaryTree(a2);
        Integer[] r2 = {2, 1, 3};
        BinaryTreeInorderTraversal s = new BinaryTreeInorderTraversal();
        assertEquals(Arrays.asList(r1), s.inorderTraversal(tree.getRoot()));
        assertEquals(Arrays.asList(r1), foo(tree.getRoot()));
        assertEquals(Arrays.asList(r2), s.inorderTraversal(tree2.getRoot()));
        assertEquals(Arrays.asList(r2), foo(tree2.getRoot()));
    }

    // 出栈时打印 null不入栈， cur不置为null
    private List<Integer> foo(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur;
        while (!stack.isEmpty()) {
            cur = stack.peek();
            if (cur.left != null) {
                stack.push(cur.left);
            } else {
                while (!stack.isEmpty()) {
                    TreeNode peek = stack.pop();
                    res.add(peek.val);
                    if (peek.right != null) {
                        stack.push(peek.right);
                        break;
                    }
                }
            }
        }

        return res;
    }
}