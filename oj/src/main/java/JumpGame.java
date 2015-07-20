/**
 * Given an array of non-negative integers,
 * you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 * <p>
 * For example:
 * A = [2,3,1,1,4], return true.
 * <p>
 * A = [3,2,1,0,4], return false.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i <= max && max < nums.length && i < nums.length; i++) {
            max = (nums[i] + i > max) ? nums[i] + i : max;
        }
        return max >= nums.length - 1;
    }
}
