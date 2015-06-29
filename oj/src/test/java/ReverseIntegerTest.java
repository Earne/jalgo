import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void testReverse() throws Exception {
        ReverseInteger s = new ReverseInteger();
        assertEquals(321, s.reverse(123));
        assertEquals(-123, s.reverse(-321));
    }
}