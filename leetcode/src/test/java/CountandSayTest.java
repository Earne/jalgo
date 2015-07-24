import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountandSayTest {

    @Test
    public void testCountAndSay() throws Exception {
        CountandSay s = new CountandSay();
        assertEquals("1", s.countAndSay(1));
        assertEquals("11", s.countAndSay(2));
        assertEquals("21", s.countAndSay(3));
        assertEquals("1211", s.countAndSay(4));
    }
}