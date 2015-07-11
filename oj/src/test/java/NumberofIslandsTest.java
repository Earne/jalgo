import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberofIslandsTest {

    @Test
    public void testNumIslands() throws Exception {
        char[][] a = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        char[][] a2 = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        NumberofIslands s = new NumberofIslands();
        assertEquals(3, s.numIslands(a));
        assertEquals(1, s.numIslands(a2));
    }
}