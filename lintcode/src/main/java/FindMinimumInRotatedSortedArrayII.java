/**
 * 寻找旋转排序数组中的最小值 II
 * 假设一个旋转排序的数组其起始位置是未知的（比如0 1 2 4 5 6 7 可能变成是4 5 6 7 0 1 2）。
 * <p/>
 * 你需要找到其中最小的元素。
 * <p/>
 * 数组中可能存在重复的元素。
 * 样例
 * <p/>
 * 给出[4,4,5,6,7,0,1,2]  返回 0
 */
public class FindMinimumInRotatedSortedArrayII {
    /**
     * @param num: a rotated sorted array
     * @return min: the minimum number in the array
     */
    public int findMin(int[] num) {
        int left = 0;
        int right = num.length - 1;
        int mid;
        while (left < right) {
            if (right - left == 1)
                return Math.min(num[left], num[right]);
            mid = left + (right - left) / 2;

            if (num[left] == num[mid] && num[right] == num[mid]) {
                int res = num[left];
                for (int i = left; i < right; i++) {
                    if (num[i] < res)
                        res = num[i];
                }
                return res;
            }

            if (num[mid] <= num[right])
                right = mid;
            else
                left = mid;

        }
        return num[left];
    }
}
