import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesfromSortedArrayIITest {

    @Test
    public void testRemoveDuplicates() throws Exception {
        RemoveDuplicatesfromSortedArrayII s = new RemoveDuplicatesfromSortedArrayII();
        assertEquals(5, s.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        assertEquals(1, s.removeDuplicates(new int[]{1}));
        assertEquals(2, s.removeDuplicates(new int[]{1, 1}));
        assertEquals(2, s.removeDuplicates(new int[]{1, 1, 1}));
        assertEquals(3, s.removeDuplicates(new int[]{1, 1, 1, 2}));
        assertEquals(3, s.removeDuplicates(new int[]{1, 2, 2}));
    }
}