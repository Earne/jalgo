/**
 * Created by earne on 6/26/15.
 */
public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            if (right - left == 1)
                return (nums[left] < nums[right]) ? nums[left] : nums[right];
            mid = left + (right - left) / 2;
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                int result = nums[left];
                for (int i = 0; i < right; i++) {
                    if (result > nums[i])
                        result = nums[i];
                }
                return result;
            }

            if (nums[mid] <= nums[right])
                right = mid;
            else
                left = mid;

        }
        return nums[left];
    }
}
