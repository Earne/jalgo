import org.junit.Test;

public class PathSumIITest {

    @Test
    public void testPathSum() throws Exception {
        BinaryTree ta = new BinaryTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null,
                null, null, 5, 1});
        PathSumII s = new PathSumII();
        System.out.print(s.pathSum(ta.getRoot(), 22));
    }
}