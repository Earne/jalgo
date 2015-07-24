/**
 * Given a sorted array of integers,
 * find the starting and ending position of a given target value.
 * <p>
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int tmpLoc = helper(nums, target, 0, nums.length - 1);
        int[] res = new int[]{tmpLoc, tmpLoc};
        while (helper(nums, target, 0, res[0] - 1) != -1) {
            res[0] = helper(nums, target, 0, res[0] - 1);
        }
        while (helper(nums, target, res[1] + 1, nums.length - 1) != -1) {
            res[1] = helper(nums, target, res[1] + 1, nums.length - 1);
        }
        return res;
    }

    private int helper(int[] nums, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

}
