import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddDigitsTest {

    @Test
    public void testAddDigits() throws Exception {
        AddDigits s = new AddDigits();
        assertEquals(2, s.addDigits(38));
        assertEquals(2, s.addDigits(11));
    }
}