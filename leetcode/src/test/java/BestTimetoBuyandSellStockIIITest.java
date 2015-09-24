import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestTimetoBuyandSellStockIIITest {

    @Test
    public void testMaxProfit() throws Exception {
        BestTimetoBuyandSellStockIII s = new BestTimetoBuyandSellStockIII();
        assertEquals(6, s.maxProfit(new int[]{4, 4, 6, 1, 1, 4, 2, 5}));
        assertEquals(0, s.maxProfit(null));
    }
}