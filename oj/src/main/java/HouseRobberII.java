/**
 * Note: This is an extension of House Robber.
 * <p/>
 * After robbing those houses on that street,
 * the thief has found himself a new place for his thievery so that
 * he will not get too much attention.
 * This time, all houses at this place are arranged in a circle.
 * That means the first house is the neighbor of the last one.
 * Meanwhile, the security system for these houses remain the same as for
 * those in the previous street.
 * <p/>
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }

    private int helper(int[] nums, int beg, int end) {
        int p = 0, q = nums[beg];
        for (int i = beg + 1; i <= end; i++) {
            int tmp = q;
            q = Math.max(p + nums[i], q);
            p = tmp;
        }
        return Math.max(p, q);
    }
}
