/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * <p>
 * Would this affect the run-time complexity? How and why?
 * <p>
 * Write a function to determine if a given target is in the array.
 */
public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int beg = 0;
        int end = nums.length - 1;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[beg] == nums[mid] || nums[end] == nums[mid]) {
                for (int i = beg; i <= end; i++)
                    if (nums[i] == target)
                        return true;
                return false;
            } else if (nums[mid] >= nums[beg]) {
                if (target >= nums[beg] && target < nums[mid])
                    end = mid - 1;
                else
                    beg = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[end])
                    beg = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}
