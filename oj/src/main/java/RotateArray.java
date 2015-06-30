/**
 * Rotate an array of n elements to the right by k steps.
 * <p>
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * <p>
 * Note:
 * Try to come up as many solutions as you can,
 * there are at least 3 different ways to solve this problem.
 * <p>
 * [show hint]
 * Hint:
 * Could you do it in-place with O(1) extra space?
 * <p>
 * Related problem: Reverse Words in a String II
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        helper(nums, 0, nums.length - k - 1);
        helper(nums, nums.length - k, nums.length - 1);
        helper(nums, 0, nums.length - 1);
    }

    public void helper(int[] nums, int p, int q) {
        int tmp;
        while (p < q) {
            tmp = nums[q];
            nums[q] = nums[p];
            nums[p] = tmp;
            p++;
            q--;
        }
    }
}
