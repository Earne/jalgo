import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 中位数 II
 * 数字是不断进入数组的，在每次添加一个新的数进入数组的同时返回当前新数组的中位数。
 * <p/>
 * 样例
 * <p/>
 * 持续进入数组的数的列表为：[1, 2, 3, 4, 5]，则返回[1, 1, 2, 2, 3]
 * <p/>
 * 持续进入数组的数的列表为：[4, 5, 1, 3, 2, 6, 0]，则返回 [4, 4, 4, 3, 3, 3, 3]
 * <p/>
 * 持续进入数组的数的列表为：[2, 20, 100]，则返回[2, 2, 20]
 * 挑战
 * <p/>
 * 时间复杂度为O(nlogn)
 * 说明
 * <p/>
 * 中位数的定义：
 * <p/>
 * 中位数是排序后数组的中间值，如果有数组中有n个数，则中位数为A[(n-1)/2]。
 * 比如：数组A=[1,2,3]的中位数是2，数组A=[1,19]的中位数是1。
 */
public class DataStreamMedian {
    /**
     * @param nums: A list of integers.
     * @return res: the median of numbers
     */
    public int[] medianII(int[] nums) {
        int[] res = new int[nums.length];
        PriorityQueue<Integer> largeValueHeap = new PriorityQueue<>();
        PriorityQueue<Integer> smallValueHeap = new PriorityQueue<>(11, Collections.reverseOrder());

        int median = nums[0];
        res[0] = median;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > median)
                largeValueHeap.add(nums[i]);
            else
                smallValueHeap.add(nums[i]);

            if (largeValueHeap.size() > smallValueHeap.size() + 1) {
                smallValueHeap.add(median);
                median = largeValueHeap.poll();
            } else if (largeValueHeap.size() < smallValueHeap.size()) {
                largeValueHeap.add(median);
                median = smallValueHeap.poll();
            }
            res[i] = median;
        }
        return res;
    }
}
