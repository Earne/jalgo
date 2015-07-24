/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int pre = nums[0], times = 1;
        for (int i: nums) {
            if (i == pre)
                times++;
            else if (--times == 0) {
                pre = i;
                times = 1;
            }
        }

        return pre;
    }
}
