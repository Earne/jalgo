import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMinimumInRotatedSortedArrayIITest {

    @Test
    public void testFindMin() throws Exception {
        FindMinimumInRotatedSortedArrayII s = new FindMinimumInRotatedSortedArrayII();
        assertEquals(1, s.findMin(new int[]{1, 2, 2, 2, 2}));
    }
}