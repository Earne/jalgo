import java.util.List;

/**
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 * <p>
 * For example, given the following triangle
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * <p>
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * <p>
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space,
 * where n is the total number of rows in the triangle.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] pretmp = new int[triangle.size()];
        int[] curtmp = new int[triangle.size()];
        for (List<Integer> curRow : triangle) {
            for (int i = 0; i < curRow.size(); i++) {
                if (i == 0)
                    curtmp[i] = pretmp[0] + curRow.get(i);
                else if (i == curRow.size() - 1)
                    curtmp[i] = pretmp[i - 1] + curRow.get(i);
                else
                    curtmp[i] = curRow.get(i) + Math.min(pretmp[i - 1], pretmp[i]);
            }
            pretmp = curtmp.clone();
        }
        int res = curtmp[0];
        for (int i : curtmp)
            if (res > i)
                res = i;
        return res;
    }

    // TODO better solution
}
