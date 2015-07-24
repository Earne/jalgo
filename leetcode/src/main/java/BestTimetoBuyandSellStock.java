/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int result = 0;
        int curMax = Integer.MIN_VALUE;
        for (int i = prices.length - 1; i >= 0; i--) {
            curMax = (curMax > prices[i]) ? curMax : prices[i];
            result = Math.max(result, curMax - prices[i]);
        }
        return result;
    }
}
