import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Given a set of distinct integers, nums, return all possible subsets.

 Note:

 Elements in a subset must be in non-descending order.
 The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]

 */
public class Subsets {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        helper(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private void helper(int[] nums, ArrayList<Integer> subset, int cur) {
        if (cur == nums.length)
            return;
        for (int i = cur; i < nums.length; i++) {
            subset.add(nums[i]);
            result.add(new ArrayList<Integer>(subset));
            helper(nums, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        for (int i: nums) {
            List<List<Integer>> tmpres = new ArrayList<List<Integer>>();
            for (List<Integer> tmp : result) {
                List<Integer> sub = new ArrayList<Integer>(tmp);
                sub.add(i);
                tmpres.add(new ArrayList<Integer>(sub));
            }
            result.addAll(tmpres);
        }
        return result;
    }
}
