import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers,
 * find the length of the longest consecutive elements sequence.
 * <p>
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * <p>
 * Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums)
            set.add(num);

        for (int cur : nums) {
            int tmp = 0;
            if (set.contains(cur - 1))
                continue;
            while (set.contains(cur)) {
                tmp++;
                cur++;
            }
            res = Math.max(res, tmp);
        }

        return res;
    }
}
