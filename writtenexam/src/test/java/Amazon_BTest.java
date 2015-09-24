import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 9/23/15.
 */
public class Amazon_BTest {

    @Test
    public void testIsPath() throws Exception {
        int[][] grid1 = new int[][]{{1, 1, 1}, {9, 1, 1}, {0, 1, 0}};
        assertEquals(1, Amazon_B.isPath(grid1));
    }
}