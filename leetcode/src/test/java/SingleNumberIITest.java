import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class SingleNumberIITest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumberII s = new SingleNumberII();
        int[] a1 = {1, 2, 1, 1};
        int[] a2 = {1, 1, 1, 2, 3, 3,3};
        assertEquals(2, s.singleNumber(a1));
        assertEquals(2, s.singleNumber(a2));

    }
}