import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringtoIntegerTest {

    @Test
    public void testMyAtoi() throws Exception {
        StringtoInteger s = new StringtoInteger();

        assertEquals(1, s.myAtoi("1"));
        assertEquals(13456, s.myAtoi("  13456"));
        assertEquals(-13456, s.myAtoi("-13456"));
        assertEquals(0, s.myAtoi("   "));
        assertEquals(Integer.MAX_VALUE, s.myAtoi("2147483647214"));
        assertEquals(-2147483648, s.myAtoi("-2147483649"));
        assertEquals(Integer.MAX_VALUE, s.myAtoi("9223372036854775809\""));
    }
}