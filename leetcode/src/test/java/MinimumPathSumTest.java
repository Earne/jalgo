import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/17/15.
 */
public class MinimumPathSumTest {

    @Test
    public void testMinPathSum() throws Exception {
        int[][] a = {
                {1, 2, 3},
                {2, 3, 5},
                {4, 1, 2}
        };
        MinimumPathSum s = new MinimumPathSum();
        assertEquals(9, s.minPathSum(a));
    }
}