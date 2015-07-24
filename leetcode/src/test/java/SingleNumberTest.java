import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumber s = new SingleNumber();
        int[] a1 = {0};
        int[] a2 = {1, 2, 2};
        assertEquals(0, s.singleNumber(a1));
        assertEquals(1, s.singleNumber(a2));
    }
}