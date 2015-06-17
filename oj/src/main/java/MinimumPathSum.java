/**
 * Given a m x n grid filled with non-negative numbers,
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] result = grid[0];
        for (int i = 1; i < n; i++)
            result[i] += result[i-1];

        for (int i = 1; i < m; i++) {
            result[0] += grid[i][0];
            for (int j = 1; j <n; j++) {
                result[j] = Math.min(result[j-1], result[j]) + grid[i][j];
            }
        }

        return result[n - 1];
    }
}
