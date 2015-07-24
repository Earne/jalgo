import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets.
 * <p>
 * Note:
 * <p>
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * <p>
 * For example,
 * If nums = [1,2,2], a solution is:
 * <p>
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        Arrays.sort(nums);
        helper(res, nums, new ArrayList<Integer>(), 0);
        return res;
    }

    private void helper(List<List<Integer>> res, int[] nums, ArrayList<Integer> curList, int index) {
        if (index == nums.length)
            return;
        for (int i = index; i < nums.length; i++) {
            // TODO refactor this
            if (i > index && nums[i] == nums[i - 1])
                continue;
            curList.add(nums[i]);
            res.add(new ArrayList<Integer>(curList));
            helper(res, nums, curList, i + 1);
            curList.remove(curList.size() - 1);
        }
    }

    // TODO add bit manipulation solution
}
