import java.util.ArrayList;
import java.util.List;

/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * For example,
 * If n = 4 and k = 2, a solution is:
 * <p>
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class Combinations {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        helper(n, k, 1, new ArrayList<Integer>());
        return result;
    }

    private void helper(int n, int k, int beg, ArrayList<Integer> integers) {
        if (k == 0) {
            result.add(new ArrayList<Integer>(integers));
            return;
        }
        for (int i = beg; i <= n; i++) {
            integers.add(i);
            helper(n, k - 1, i + 1, integers);
            integers.remove(integers.size() - 1);
        }
    }

    // TODO add recursive Java solution based on C(n,k)=C(n-1,k-1)+C(n-1,k)
}
