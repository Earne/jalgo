import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOneInBinaryTest {

    @Test
    public void testCountOnes() throws Exception {
        CountOneInBinary s = new CountOneInBinary();
        assertEquals(3, s.countOnes(7));
        assertEquals(10, s.countOnes(1023));
        assertEquals(1, s.countOnes(32));
        assertEquals(2, s.countOnes(5));
    }
}