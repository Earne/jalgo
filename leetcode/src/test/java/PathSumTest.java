import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSumTest {

    @Test
    public void testHasPathSum() throws Exception {
        Integer[] a = {1, -2, -3, 1, 3, -2, null, -1};
        BinaryTree b = new BinaryTree(a);
        PathSum s = new PathSum();
        assertEquals(true, s.hasPathSum(b.getRoot(), 2));
        assertEquals(true, s.hasPathSum2(b.getRoot(), 2));
        assertEquals(true, s.hasPathSum3(b.getRoot(), 2));
        assertEquals(true, s.hasPathSum4(b.getRoot(), 2));
    }
}
