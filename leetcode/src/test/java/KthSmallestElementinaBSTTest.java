import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestElementinaBSTTest {

    @Test
    public void testKthSmallest() throws Exception {
        Integer[] a = {5, 2, 6, 1, 3, null, 9};
        BinaryTree ta = new BinaryTree(a);

        KthSmallestElementinaBST s = new KthSmallestElementinaBST();
        assertEquals(2, s.kthSmallest(ta.getRoot(), 2));
        assertEquals(3, s.kthSmallest(ta.getRoot(), 3));
        assertEquals(6, s.kthSmallest(ta.getRoot(), 5));
    }
}