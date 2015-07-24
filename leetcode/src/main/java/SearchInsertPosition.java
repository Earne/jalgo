/**
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi -lo) / 2;
            if (nums[mid] > target)
                hi = mid -1;
            else if (nums[mid] < target)
                lo = mid + 1;
            else
                return mid;
        }
        return (nums[mid] > target) ? mid : mid + 1;
    }
}
