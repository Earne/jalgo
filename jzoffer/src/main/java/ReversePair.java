import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。给你一个数组，求出这个数组中逆序对的总数。
 * 概括：如果a[i] > a[j] 且 i < j， a[i] 和 a[j] 构成一个逆序对。
 * 样例
 * <p>
 * 样例1
 * <p>
 * 输入: A = [2, 4, 1, 3, 5]
 * 输出: 3
 * 解释:
 * (2, 1), (4, 1), (4, 3) 是逆序对
 * <p>
 * 样例2
 * <p>
 * 输入: A = [1, 2, 3, 4]
 * 输出: 0
 * 解释:
 * 没有逆序对
 *
 * @author gengyuanzhen
 */
public class ReversePair {
    /**
     * @param arr: an array
     * @return: total of reverse pairs
     */
    public long reversePairs(int[] arr) {
        long result = 0;
        // 记录元素及出现次数
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i];
            SortedMap<Integer, Integer> headMap = sortedMap.headMap(cur);
            int headSum = headMap.values().stream().mapToInt(Integer::intValue).sum();
            result += headSum;
            sortedMap.put(cur, sortedMap.getOrDefault(cur, 0) + 1);
        }
        return result;
    }
}
