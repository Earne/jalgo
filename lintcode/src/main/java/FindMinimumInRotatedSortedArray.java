/**
 * 寻找旋转排序数组中的最小值
 * 假设一个旋转排序的数组其起始位置是未知的（比如0 1 2 4 5 6 7 可能变成是4 5 6 7 0 1 2）。
 * <p/>
 * 你需要找到其中最小的元素。
 * <p/>
 * 你可以假设数组中不存在重复的元素。
 * 样例
 * <p/>
 * 给出[4,5,6,7,0,1,2]  返回 0
 */
public class FindMinimumInRotatedSortedArray {
    /**
     * @param num: a rotated sorted array
     * @return num[p]: the minimum number in the array
     */
    public int findMin(int[] num) {
        if (num == null || num.length == 0)
            throw new IllegalArgumentException();

        int p = 0, q = num.length - 1;
        while (p < q) {
            if (q - p == 1)
                return Math.min(num[p], num[q]);
            int mid = p + (q - p) / 2;
            if (num[mid] < num[q])
                q = mid;
            else
                p = mid;
        }
        return num[p];
    }
}
