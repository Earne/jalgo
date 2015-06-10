import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/10/15.
 */
public class SameTreeTest {

    Integer[] a1 = {1, 2, null, 3};
    Integer[] a2 = {1, 3, null, 3};
    BinaryTree tree = new BinaryTree(a1);
    BinaryTree tree2 = new BinaryTree(a2);
    SameTree s = new SameTree();

    @Test
    public void testIsSameTree() throws Exception {
        assertEquals(true, s.isSameTree(tree.getRoot(), tree.getRoot()));
        assertEquals(false, s.isSameTree(tree.getRoot(), tree2.getRoot()));
    }
}