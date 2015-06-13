import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class ConvertSortedArraytoBinarySearchTreeTest {

    @Test
    public void testSortedArrayToBST() throws Exception {
        ConvertSortedArraytoBinarySearchTree s = new ConvertSortedArraytoBinarySearchTree();
        int[] a1 = {1, 2, 3};
        TreeNode root1 = s.sortedArrayToBST(a1);
        assertEquals(2, root1.val);
        assertEquals(1, root1.left.val);
        assertEquals(3, root1.right.val);
    }
}