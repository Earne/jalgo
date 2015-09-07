/**
 * 奇偶分割数组
 * 分割一个整数数组，使得奇数在前偶数在后。
 * 样例
 * <p/>
 * 给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]。
 * 挑战
 * <p/>
 * 在原数组中完成，不使用额外空间。
 */
public class PartitionArrayByOddAndEven {
    /**
     * @param nums: an array of integers
     */
    public void partitionArray(int[] nums) {
        if (nums == null)
            return;
        int p = 0, q = nums.length - 1;
        while (p < q) {
            while (p < q && nums[p] % 2 == 1)
                p++;
            while (p < q && nums[q] % 2 == 0)
                q--;
            if (p < q) {
                int tmp = nums[p];
                nums[p] = nums[q];
                nums[q] = tmp;
            }
        }
    }
}
