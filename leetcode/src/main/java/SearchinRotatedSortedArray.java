/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p>
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>
 * You may assume no duplicate exists in the array.
 */
public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] >= nums[beg])
                if (target >= nums[beg] && target < nums[mid])
                    end = mid - 1;
                else
                    beg = mid + 1;
            else if (target <= nums[end] && target > nums[mid])
                beg = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
}
