import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> cur;
        for (int i = 1; i <= numRows; i++) {
            cur = new ArrayList<Integer>();
            cur.add(1);
            for (int j = 1; j < i - 1; j++) {
                cur.add(pre.get(j - 1) + pre.get(j));
            }
            if (i > 1)
                cur.add(1);
            pre = cur;
            result.add(cur);
        }
        return result;
    }
}
