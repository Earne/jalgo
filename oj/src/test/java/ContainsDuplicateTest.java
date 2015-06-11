import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() throws Exception {
        int[] a1 = {1, 3, 4};
        int[] a2 = {1, 3, 4, 5, 3};
        ContainsDuplicate s = new ContainsDuplicate();
        assertEquals(false, s.containsDuplicate(a1));
        assertEquals(true, s.containsDuplicate(a2));
    }
}