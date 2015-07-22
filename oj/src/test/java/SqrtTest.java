import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {

    @Test
    public void testMySqrt() throws Exception {
        Sqrt s = new Sqrt();
        assertEquals(3, s.mySqrt(9));
        assertEquals(46339, s.mySqrt(2147395599));
    }
}