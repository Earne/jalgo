import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class UniquePathsTest {

    @Test
    public void testUniquePaths() throws Exception {
        UniquePaths s = new UniquePaths();
        assertEquals(1, s.uniquePaths(1, 7));
        assertEquals(1, s.uniquePaths(2, 1));
        assertEquals(2, s.uniquePaths(2, 2));
    }
}