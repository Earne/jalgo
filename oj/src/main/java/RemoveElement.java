/**
 * Given an array and a value,
 * remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int p = 0, q = 0;
        while (q < nums.length) {
            if (nums[q] != val) {
                nums[p] = nums[q];
                p++;
            }
            q++;
        }
        return p;
    }
}
