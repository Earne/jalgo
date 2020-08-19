import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class SubarrayProductLessThanKTest {

    @Test
    public void numSubarrayProductLessThanK() {
        assertEquals(8, new SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}