import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorofaBinarySearchTreeTest {

    @Test
    public void testLowestCommonAncestor() throws Exception {
        BinaryTree ta = new BinaryTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        LowestCommonAncestorofaBinarySearchTree s = new LowestCommonAncestorofaBinarySearchTree();
        assertEquals(6, s.lowestCommonAncestor(ta.getRoot(), ta.getRoot().left, ta.getRoot()
                .right).val);
        assertEquals(2, s.lowestCommonAncestor(ta.getRoot(), ta.getRoot().left,
                ta.getRoot().left.right).val);
    }
}