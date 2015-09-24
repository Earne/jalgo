import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 9/24/15.
 */
public class Youdao_ATest {

    @Test
    public void testFoo() throws Exception {
        BinaryTree tree = new BinaryTree(new Integer[]{7, 3, 9, 2, 5, 8, 10, 1, null, 4, 6, null,
                null, null, 11});
        Youdao_A s = new Youdao_A();
        s.foo(tree.getRoot());
        TreeNode.inOrderPrintTree(tree.getRoot());
        System.out.println();
        TreeNode.preOrderPrintTree(tree.getRoot());
    }
}