import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/26/15.
 */
public class FindPeakElementTest {

    @Test
    public void testFindPeakElement() throws Exception {
        int[] a = {1, 2, 3, 1};
        FindPeakElement s = new FindPeakElement();
        assertEquals(2, s.findPeakElement(a));
    }
}