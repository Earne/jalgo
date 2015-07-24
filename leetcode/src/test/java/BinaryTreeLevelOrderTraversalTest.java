import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrder() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree tree1 = new BinaryTree(a1);
        List<List<Integer>> r1 = new ArrayList<List<Integer>>();
        r1.add(Collections.singletonList(1));
        r1.add(Collections.singletonList(2));
        r1.add(Collections.singletonList(3));

        Integer[] a2 = {1, 2, 3};
        BinaryTree tree2 = new BinaryTree(a2);
        List<List<Integer>> r2 = new ArrayList<List<Integer>>();
        r2.add(Collections.singletonList(1));
        r2.add(Arrays.asList(2, 3));

        BinaryTreeLevelOrderTraversal s = new BinaryTreeLevelOrderTraversal();

        assertEquals(r1, s.levelOrder(tree1.getRoot()));
        assertEquals(r2, s.levelOrder(tree2.getRoot()));
    }
}