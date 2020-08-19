import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class LowestCommonAncestorofaBinaryTreeTest {

    @Test
    public void lowestCommonAncestor() {
        BinaryTree ta = new BinaryTree(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        LowestCommonAncestorofaBinaryTree s = new LowestCommonAncestorofaBinaryTree();
        assertEquals(4,
                s.lowestCommonAncestor(ta.getRoot(),
                        ta.getRoot().left.right.left,
                        ta.getRoot().left.right.right).val);
    }

}