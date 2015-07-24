import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/26/15.
 */
public class FindMinimuminRotatedSortedArrayIITest {

    @Test
    public void testFindMin() throws Exception {
        FindMinimuminRotatedSortedArrayII s = new FindMinimuminRotatedSortedArrayII();
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int[] b = {1, 0, 1, 1, 1};
        assertEquals(0, s.findMin(a));
        assertEquals(0, s.findMin(b));
    }
}