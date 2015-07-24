import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniquePathsIITest {

    @Test
    public void testUniquePathsWithObstacles() throws Exception {
        UniquePathsII s = new UniquePathsII();
        assertEquals(0, s.uniquePathsWithObstacles(new int[][]{{1, 0}}));
        assertEquals(2, s.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}