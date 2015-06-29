import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() throws Exception {
        ReverseInteger s = new ReverseInteger();
        assertEquals(321, s.reverse(123));
        assertEquals(-123, s.reverse(-321));
        assertEquals(0, s.reverse(1534236469));
        assertEquals(0, s.reverse(-2147483648));
    }
}