package ernest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 * Medium
 * <p>
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p>
 * Note:
 * <p>
 * The solution set must not contain duplicate triplets.
 * <p>
 * Example:
 * <p>
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * <p>
 * A solution set is:
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            while (i > 0 && i < nums.length - 2 && nums[i] == nums[i - 1]) {
                i++;
            }
            int p = i + 1;
            int q = nums.length - 1;

            while (p < q) {
                if (nums[p] + nums[q] + nums[i] == 0) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[p]);
                    ans.add(nums[q]);
                    while (p < q && nums[p] == nums[p + 1]) {
                        p++;
                    }
                    p++;
                    while (p < q && nums[q] == nums[q - 1]) {
                        q--;
                    }
                    q--;
                    res.add(ans);
                    continue;
                }
                if (nums[p] + nums[q] < 0 - nums[i]) {
                    p++;
                } else {
                    q--;
                }
            }
        }
        return res;
    }
}
