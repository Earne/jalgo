import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

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
        assertEquals(Arrays.asList(r2), s.inorderTraversal(tree2.getRoot()));
    }
}