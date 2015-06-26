/**
 * Created by earne on 6/26/15.
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
