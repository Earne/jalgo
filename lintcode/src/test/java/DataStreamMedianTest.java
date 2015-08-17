import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DataStreamMedianTest {

    @Test
    public void testMedianII() throws Exception {
        DataStreamMedian s = new DataStreamMedian();
        assertArrayEquals(new int[]{1, 1, 2, 2, 3}, s.medianII(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{4, 4, 4, 3, 3, 3, 3}, s.medianII(new int[]{4, 5, 1, 3, 2, 6, 0}));
    }
}