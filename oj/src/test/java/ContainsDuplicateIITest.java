import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateIITest {

    @Test
    public void testContainsNearbyDuplicate() throws Exception {
        ContainsDuplicateII s = new ContainsDuplicateII();
        assertEquals(true, s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 5}, 3));
        assertEquals(false, s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 5}, 2));
    }
}