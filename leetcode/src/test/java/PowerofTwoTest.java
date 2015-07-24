import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerofTwoTest {

    @Test
    public void testIsPowerOfTwo() throws Exception {
        PowerofTwo s = new PowerofTwo();
        assertEquals(false, s.isPowerOfTwo(0));
        assertEquals(true, s.isPowerOfTwo(2));
        assertEquals(true, s.isPowerOfTwo(8));
        assertEquals(false, s.isPowerOfTwo(12));
    }
}