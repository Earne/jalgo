import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/24/15.
 */
public class HappyNumberTest {

    @Test
    public void testIsHappy() throws Exception {
        HappyNumber s = new HappyNumber();
        assertEquals(true, s.isHappy(7));
        assertEquals(false, s.isHappy(2));
    }
}