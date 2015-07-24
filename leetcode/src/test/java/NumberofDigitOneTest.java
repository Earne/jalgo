import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberofDigitOneTest {

    @Test
    public void testCountDigitOne() throws Exception {
        NumberofDigitOne s = new NumberofDigitOne();
        assertEquals(6, s.countDigitOne(13));
        assertEquals(1, s.countDigitOne(1));
    }
}