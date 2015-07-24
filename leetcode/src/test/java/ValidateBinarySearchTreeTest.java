import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateBinarySearchTreeTest {

    @Test
    public void testIsValidBST() throws Exception {
        BinaryTree a = new BinaryTree(new Integer[]{1, 1});
        BinaryTree a2 = new BinaryTree(new Integer[]{4, 2, 5, null, 3});
        ValidateBinarySearchTree s = new ValidateBinarySearchTree();
//        assertEquals(false, s.isValidBST(a.getRoot()));
        assertEquals(true, s.isValidBST(a2.getRoot()));
    }
}