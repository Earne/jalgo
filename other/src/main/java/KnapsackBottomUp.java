import java.util.ArrayList;
import java.util.List;

public class KnapsackBottomUp {
    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        // 在遍历完前一元素后，在各个容量下所能达到的最大profit

        List<Integer> prev = new ArrayList<>(capacity + 1);
        List<Integer> cur = new ArrayList<>(capacity + 1);
        for (int c = 0; c <= capacity; c++) {
            if (weights[0] <= c) {
                cur.add(profits[0]);
            } else {
                cur.add(0);
            }
            prev.add(0);
        }

        for (int i = 1; i < profits.length; i++) {
            List<Integer> tmp = prev;
            prev = cur;
            cur = tmp;
            for (int c = 0; c <= capacity; c++) {
                if (weights[i] <= c) {
                    int profit1 = profits[i] + prev.get(c - weights[i]);
                    cur.set(c, Math.max(profit1, prev.get(c)));
                } else {
                    cur.set(c, prev.get(c));
                }
            }
        }
        return cur.get(capacity);
    }

    public static void main(String[] args) {
        KnapsackBottomUp ks = new KnapsackBottomUp();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}
