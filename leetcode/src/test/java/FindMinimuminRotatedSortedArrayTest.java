import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/26/15.
 */
public class FindMinimuminRotatedSortedArrayTest {

    @Test
    public void testFindMin() throws Exception {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        FindMinimuminRotatedSortedArray s = new FindMinimuminRotatedSortedArray();
        assertEquals(0, s.findMin(a));
    }
}