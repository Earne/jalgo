import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/9/15.
 */
public class MaximumDepthofBinaryTreeTest {

    Integer[] a1 = {1, 2, null, 3};
    Integer[] a2 = {null};
    BinaryTree tree = new BinaryTree(a1);
    BinaryTree tree2 = new BinaryTree(a2);
    MaximumDepthofBinaryTree foo= new MaximumDepthofBinaryTree();

    @Test
    public void testMaxDepth() throws Exception {
        assertEquals(0, foo.maxDepth(tree2.getRoot()));
        assertEquals(3, foo.maxDepth(tree.getRoot()));
        assertEquals(3, foo.maxDepth2(tree.getRoot()));
    }
}