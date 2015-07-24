import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void testLevelOrderBottom() throws Exception {
        Integer[] a1 = {1, null, 2, null, null, 3};
        BinaryTree tree1 = new BinaryTree(a1);
        List<List<Integer>> r1 = new ArrayList<List<Integer>>();
        r1.add(Collections.singletonList(3));
        r1.add(Collections.singletonList(2));
        r1.add(Collections.singletonList(1));

        Integer[] a2 = {1, 2, 3};
        BinaryTree tree2 = new BinaryTree(a2);
        List<List<Integer>> r2 = new ArrayList<List<Integer>>();
        r2.add(Arrays.asList(2, 3));
        r2.add(Collections.singletonList(1));

        BinaryTreeLevelOrderTraversalII s = new BinaryTreeLevelOrderTraversalII();

        assertEquals(r1, s.levelOrderBottom(tree1.getRoot()));
        assertEquals(r2, s.levelOrderBottom(tree2.getRoot()));
    }
}