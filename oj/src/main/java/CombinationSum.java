import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given a set of candidate numbers (C) and a target number (T),
 *  find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:

 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.

 For example, given candidate set 2,3,6,7 and target 7,
 A solution set is:
 [7]
 [2, 2, 3]
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(res, candidates, target, 0, new ArrayList<Integer>());
        return res;
    }

    private void helper(List<List<Integer>> res, int[] candidates, int stillNeed, int positon,
                        List<Integer> sub) {
        if (stillNeed < candidates[positon])
            return;
        for (int i = positon; i < candidates.length; i++) {
            sub.add(candidates[i]);
            stillNeed -= candidates[i];
            if (stillNeed == 0) {
                res.add(new ArrayList<Integer>(sub));
                positon++;
                sub.remove(sub.size() - 1);
            } else {
                helper(res, candidates, stillNeed, positon, sub);
                stillNeed += candidates[positon];
                positon++;
                sub.remove(sub.size() - 1);

            }
        }
    }

    // TODO refactor this
}
