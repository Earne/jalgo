import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PascalsTriangleIITest {

    @Test
    public void testGetRow() throws Exception {
        PascalsTriangleII s = new PascalsTriangleII();
        assertEquals(Arrays.asList(new Integer[]{1}), s.getRow(0));
        assertEquals(Arrays.asList(new Integer[]{1, 1}), s.getRow(1));
        assertEquals(Arrays.asList(new Integer[]{1, 2, 1}), s.getRow(2));
        assertEquals(Arrays.asList(new Integer[]{1, 3, 3, 1}), s.getRow(3));
        assertEquals(Arrays.asList(new Integer[]{1, 4, 6, 4, 1}), s.getRow(4));
    }
}