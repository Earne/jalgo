/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Example 1:
 * <p>
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * Answer: 1
 * <p>
 * Example 2:
 * <p>
 * 11000
 * 11000
 * 00100
 * 00011
 * <p>
 * Answer: 3
 */
public class NumberofIslands {
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1')
                    helper(grid, i, j, result++);
            }
        }
        return result;
    }

    private void helper(char[][] grid, int i, int j, int result) {
        grid[i][j] = '0';
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1')
            helper(grid, i, j + 1, result);
        if (i < grid.length - 1 && grid[i + 1][j] == '1')
            helper(grid, i + 1, j, result);
        if (i > 0 && grid[i - 1][j] == '1')
            helper(grid, i - 1, j, result);
        if (j > 0 && grid[i][j - 1] == '1')
            helper(grid, i, j - 1, result);
    }

    // TODO refactor this
}
