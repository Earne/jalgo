import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class BinaryTreePreorderTraversalTest {

    @Test
    public void testPreorderTraversal() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree tree = new BinaryTree(a1);
        Integer[] r1 = {1, 2, 3};

        Integer[] a2 = {1, 2, 3};
        BinaryTree tree2 = new BinaryTree(a2);

        BinaryTreePreorderTraversal s = new BinaryTreePreorderTraversal();
        assertEquals(Arrays.asList(r1), s.preorderTraversal(tree.getRoot()));

    }
}