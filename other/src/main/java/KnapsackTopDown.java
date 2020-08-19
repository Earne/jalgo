public class KnapsackTopDown {
    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        int[][] dp = new int[profits.length][capacity + 1];
        return knapsackRecursive(dp, profits, weights, capacity, 0);

    }

    /**
     * @param dp
     * @param profits
     * @param weights
     * @param capacity
     * @param currentIndex 当前索引
     * @return
     */
    private int knapsackRecursive(int[][] dp, int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity < 0 || currentIndex >= profits.length) {
            return 0;
        }
        if (dp[currentIndex][capacity] != 0) {
            return dp[currentIndex][capacity];
        }
        int profit1 = 0;
        if (profits[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + knapsackRecursive(dp, profits, weights, capacity - weights[currentIndex], currentIndex + 1);
        }

        int profit2 = knapsackRecursive(dp, profits, weights, capacity, currentIndex + 1);
        dp[currentIndex][capacity] = Math.max(profit1, profit2);
        return dp[currentIndex][capacity];
    }

    public static void main(String[] args) {
        KnapsackTopDown ks = new KnapsackTopDown();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}
