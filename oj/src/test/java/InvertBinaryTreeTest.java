import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class InvertBinaryTreeTest {

    @Test
    public void testInvertTree() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree tree = new BinaryTree(a1);

        InvertBinaryTree s = new InvertBinaryTree();
        s.invertTree(tree.getRoot());
        assertEquals(2, tree.getRoot().left.val);
        assertEquals(3, tree.getRoot().left.right.val);
    }
}