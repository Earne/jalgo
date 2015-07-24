import java.util.ArrayList;
import java.util.List;

/**
 * Find all possible combinations of k numbers that add up to a number n,
 * given that only numbers from
 * 1 to 9 can be used and each combination should be a unique set of numbers.
 * <p>
 * Ensure that numbers within the set are sorted in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: k = 3, n = 7
 * <p>
 * Output:
 * <p>
 * [[1,2,4]]
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: k = 3, n = 9
 * <p>
 * Output:
 * <p>
 * [[1,2,6], [1,3,5], [2,3,4]]
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(k, n, res, new ArrayList<Integer>(), 1);
        return res;
    }

    private void helper(int k, int need, List<List<Integer>> res, List<Integer> cur, int beg) {
        if (cur.size() == k) {
            if (need == 0)
                res.add(new ArrayList<Integer>(cur));
            return;
        }

        for (int i = beg; i <= 9 && need >= i; i++) {
            cur.add(i);
            helper(k, need - i, res, cur, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
