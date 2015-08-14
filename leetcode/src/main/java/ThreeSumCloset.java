import java.util.Arrays;

/**
 * Given an array S of n integers,
 * find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * <p/>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p/>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int res = 0;
        if (nums.length < 3)
            return res;
        int gap = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int sum;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target)
                    return target;
                if (Math.abs(sum - target) < gap) {
                    gap = Math.abs(sum - target);
                    res = sum;
                }
                if (sum < target)
                    j++;
                else
                    k--;
            }
        }

        return res;
    }
}
