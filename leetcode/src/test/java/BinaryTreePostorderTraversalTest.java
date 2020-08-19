import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/16/15.
 */
public class BinaryTreePostorderTraversalTest {

    @Test
    public void testPostorderTraversal1() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree b1 = new BinaryTree(a1);
        Integer[] r1 = {3, 2, 1};
        List<Integer> l1 = Arrays.asList(r1);
        BinaryTreePostorderTraversal s = new BinaryTreePostorderTraversal();
        assertEquals(l1, s.postorderTraversal1(b1.getRoot()));
        assertEquals(l1, s.postorderTraversal(b1.getRoot()));
    }

}