import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testTwoSum() throws Exception {
        TwoSum s = new TwoSum();
        assertArrayEquals(new int[]{1, 2}, s.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{2, 3}, s.twoSum(new int[]{3, 2, 4}, 6));
    }
}