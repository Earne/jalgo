/**
 * Given a sorted array,
 * remove the duplicates in place
 * such that each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2,
 * with the first two elements of nums being 1 and 2 respectively.
 * It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = (nums.length > 0) ? 1 : 0;
        for (int num : nums) {
            if (num > nums[i - 1])
                nums[i++] = num;
        }
        return i;
    }
}
