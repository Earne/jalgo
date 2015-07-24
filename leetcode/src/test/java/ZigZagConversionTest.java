import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigZagConversionTest {

    @Test
    public void testConvert() throws Exception {
        ZigZagConversion s = new ZigZagConversion();
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING", 3));
        assertEquals("PAHNAPLSIIGYIR", s.convert("PAHNAPLSIIGYIR", 1));
        assertEquals("ACB", s.convert("ABC", 2));
        assertEquals("ACBD", s.convert("ABCD", 2));
    }
}