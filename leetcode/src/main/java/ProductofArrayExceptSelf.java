/**
 * Given an array of n integers where n > 1, nums,
 * return an array output such that output[i]
 * is equal to the product of all the elements of nums except nums[i].
 * <p>
 * Solve it without division and in O(n).
 * <p>
 * For example, given [1,2,3,4], return [24,12,8,6].
 * <p>
 * Follow up:
 * Could you solve it with constant space complexity?
 * (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++)
            res[i] = nums[i - 1] * res[i - 1];
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] A = new int[nums.length];
        int[] B = new int[nums.length];
        A[0] = 1;
        B[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++)
            A[i] = nums[i - 1] * A[i - 1];
        for (int i = nums.length - 2; i >= 0; i--)
            B[i] = nums[i + 1] * B[i + 1];

        for (int i = 0; i < nums.length; i++)
            A[i] = A[i] * B[i];
        return A;
    }
}
