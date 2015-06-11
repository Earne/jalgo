import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class MajorityElementTest {

    @Test
    public void testMajorityElement() throws Exception {
        MajorityElement s = new MajorityElement();
        int[] a1 = {1, 1, 2, 1};
        int[] a2 = {1, 2, 1, 2, 1};
        assertEquals(1,s.majorityElement(a1));
        assertEquals(1,s.majorityElement(a2));
    }
}