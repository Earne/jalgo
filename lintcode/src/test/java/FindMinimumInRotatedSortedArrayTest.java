import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMin() throws Exception {
        FindMinimumInRotatedSortedArray s = new FindMinimumInRotatedSortedArray();
        assertEquals(0, s.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(0, s.findMin(new int[]{0}));
        assertEquals(1, s.findMin(new int[]{1, 2, 3}));
    }
}