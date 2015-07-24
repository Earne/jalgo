import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesfromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() throws Exception {
        int[] a = {1, 1, 2};
        RemoveDuplicatesfromSortedArray s = new RemoveDuplicatesfromSortedArray();
        assertEquals(2, s.removeDuplicates(a));
        assertEquals(2, a[1]);
    }
}