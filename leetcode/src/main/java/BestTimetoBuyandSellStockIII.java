/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * <p/>
 * Note:
 * You may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 */
public class BestTimetoBuyandSellStockIII {
    public int maxProfit1(int[] prices) {
        if (prices == null)
            return 0;
        if (prices.length < 2)
            return 0;

        int res = 0;
        int[] A = new int[prices.length];
        int[] B = new int[prices.length];

        int tmp = prices[0];
        for (int i = 1; i < prices.length; i++) {
            tmp = Math.min(tmp, prices[i]);
            A[i] = Math.max(prices[i] - tmp, A[i - 1]);
        }

        tmp = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            tmp = Math.max(tmp, prices[i]);
            B[i] = Math.max(tmp - prices[i], B[i + 1]);
        }

        for (int i = 0; i < prices.length; i++) {
            res = Math.max(res, A[i] + B[i]);
        }
        return res;
    }

    // O(1) space solution
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices == null || prices.length < 2)
            return 0;
        int length = prices.length;
        int a = Math.max(prices[length - 1], prices[length - 2]);
        int b = Math.max(prices[length - 1] - prices[length - 2], 0);
        int c = a;
        int d = b;
        for (int i = length - 3; i >= 0; i--) {
            d = Math.max(c - prices[i], d);
            c = Math.max(prices[i] + b, c);
            b = Math.max(a - prices[i], b);
            a = Math.max(prices[i], a);
        }
        return d;
    }
}
