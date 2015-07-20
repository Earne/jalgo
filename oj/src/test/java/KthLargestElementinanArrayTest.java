import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthLargestElementinanArrayTest {

    @Test
    public void testFindKthLargest() throws Exception {
        KthLargestElementinanArray s = new KthLargestElementinanArray();
        assertEquals(5, s.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        assertEquals(0, s.findKthLargest(new int[]{-1, 2, 0}, 2));
        assertEquals(4, s.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}