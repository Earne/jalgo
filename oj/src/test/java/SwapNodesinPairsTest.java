import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/16/15.
 */
public class SwapNodesinPairsTest {

    @Test
    public void testSwapPairs() throws Exception {
        int[] a1 = {1, 2, 3, 4};
        ListNode l1 = new ListNode(a1);
        SwapNodesinPairs s = new SwapNodesinPairs();
        l1 = s.swapPairs(l1);
        assertEquals(2, l1.val);
        assertEquals(1, l1.next.val);
    }
}