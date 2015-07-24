import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/10/15.
 */
public class Numberof1BitsTest {

    @Test(timeout = 500)
    public void testHammingWeight() throws Exception {
        assertEquals(3, 11);
        assertEquals(2, 2);
        assertEquals(1, 1);
        assertEquals(1, Integer.MAX_VALUE + 1);
    }
}