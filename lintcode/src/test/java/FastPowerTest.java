import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FastPowerTest {

    @Test
    public void testFastPower() throws Exception {
        FastPower s = new FastPower();
        assertEquals(1, s.fastPower(2, 3, 4));
        assertEquals(1, s.fastPower(2, 3, 0));
        assertEquals(0, s.fastPower(2, 1, 0));
        assertEquals(2, s.fastPower(2, 3, 5));
        assertEquals(2, s.fastPower(2, 3, 31));
        assertEquals(0, s.fastPower(100, 1000, 1000));
        assertEquals(2, s.fastPower(2, 2147483647, 2147483647));
    }
}