import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/18/15.
 */
public class RemoveElementTest {

    @Test
    public void testRemoveElement() throws Exception {
        int[] a = {1, 2, 4, 4, 6};
        RemoveElement s = new RemoveElement();
        assertEquals(3, s.removeElement(a, 4));
        assertEquals(6, a[2]);
    }
}