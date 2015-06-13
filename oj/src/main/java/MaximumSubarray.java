/**
 Find the contiguous subarray within an array (containing at least one number)
 which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

click to show more practice.
More practice:

 If you have figured out the O(n) solution,
 try coding another solution using the divide and conquer approach, which is more subtle.

 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int[] front = new int[l];
        int[] end = new int[l];
        front[0] = end[0] = nums[0];
        for (int i = 1; i < l; i++) {
            end[i] = Math.max(end[i - 1] + nums[i], nums[i]);
            front[i] = Math.max(end[i], front[i - 1]);
        }

        return front[l - 1];
    }
}
