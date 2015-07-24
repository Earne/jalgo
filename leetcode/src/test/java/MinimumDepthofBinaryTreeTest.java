import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDepthofBinaryTreeTest {

    @Test
    public void testMinDepth() throws Exception {
        Integer[] a1 = {1, 2, null, 3};
        Integer[] a2 = {null};
        Integer[] a3 = {1, 2, 3, null, 4};
        BinaryTree tree = new BinaryTree(a1);
        BinaryTree tree2 = new BinaryTree(a2);
        BinaryTree tree3 = new BinaryTree(a3);

        MinimumDepthofBinaryTree s = new MinimumDepthofBinaryTree();

        assertEquals(3, s.minDepth(tree.getRoot()));
        assertEquals(0, s.minDepth(tree2.getRoot()));
        assertEquals(2, s.minDepth(tree3.getRoot()));
    }
}