import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/14/15.
 */
public class BestTimetoBuyandSellStockTest {

    @Test
    public void testMaxProfit() throws Exception {
        int[] a = {1, 3, 1, 4, 3, 2};
        BestTimetoBuyandSellStock s = new BestTimetoBuyandSellStock();

        assertEquals(3, s.maxProfit(a));
    }
}