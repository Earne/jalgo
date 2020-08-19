import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author gengyuanzhen
 */
public class SubarraySumEqualsKTest {

    @Test
    public void subarraySum() {
        int res = new SubarraySumEqualsK().subarraySum(new int[]{1, 2, 7, 1, 5}, 9);
        assertEquals(3, res);
    }
}
