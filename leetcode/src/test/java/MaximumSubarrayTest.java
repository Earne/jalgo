import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class MaximumSubarrayTest {

    @Test
    public void testMaxSubArray() throws Exception {
        MaximumSubarray s = new MaximumSubarray();
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, s.maxSubArray(a));
    }
}