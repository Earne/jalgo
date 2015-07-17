/**
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * <p>
 * For example,
 * Given sorted array nums = [1,1,1,2,2,3],
 * <p>
 * Your function should return length = 5,
 * with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int pre = 1;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[pre] && nums[i] == nums[pre - 1])
                continue;
            nums[++pre] = nums[i];
        }
        return pre + 1;
    }
}
