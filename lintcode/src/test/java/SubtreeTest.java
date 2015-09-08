import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtreeTest {

    @Test
    public void testIsSubtree() throws Exception {
        Subtree s = new Subtree();
        TreeNode T1 = new BinaryTree(new Integer[]{1, 2, 3, null, null, 4}).getRoot();
        TreeNode T2 = new BinaryTree(new Integer[]{3, 4}).getRoot();
        assertEquals(true, s.isSubtree(T1, T2));

        TreeNode T3 = new BinaryTree(new Integer[]{1, 2, 3}).getRoot();
        assertEquals(true, s.isSubtree(T3, null));
    }
}