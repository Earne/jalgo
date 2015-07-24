import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/10/15.
 */
public class BestTimetoBuyandSellStockIITest {

    BestTimetoBuyandSellStockII s = new BestTimetoBuyandSellStockII();
    int[] a0;
    int[] a1 = {1, 2, 3, 4};
    int[] a2 = {1, 3, 1, 4};
    int[] a3 = {3, 1, 5, 4};
    @Test
    public void testMaxProfit() throws Exception {
        assertEquals(0, s.maxProfit(a0));
        assertEquals(3, s.maxProfit(a1));
        assertEquals(5, s.maxProfit(a2));
        assertEquals(4, s.maxProfit(a3));
    }
}