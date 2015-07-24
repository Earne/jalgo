import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {
    ReverseBits s = new ReverseBits();

    @Test
    public void testReverseBits() throws Exception {
        assertEquals(964176192, s.reverseBits(43261596));
    }

    @Test
    public void testReverseBits1() throws Exception {
        assertEquals(964176192, s.reverseBits1(43261596));
    }

    @Test
    public void testReverseBits2() throws Exception {
        assertEquals(964176192, s.reverseBits2(43261596));
    }
}