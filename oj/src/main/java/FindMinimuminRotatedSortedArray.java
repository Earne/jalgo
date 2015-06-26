/**
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            if (right - left == 1)
                return (nums[left] > nums[right]) ? nums[right] : nums[left];
            mid = left + (right - left) / 2;
            if (nums[mid] < nums[right])
                right = mid;
            else
                left = mid;
        }
        return nums[left];
    }
}
