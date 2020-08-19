import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gengyuanzhen
 */
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // 用于存储可能的加和（小于等于k的）以及出现的次数
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 0);
        // 逐个遍历，计算可能的加和
        for (int num : nums) {
            List<Integer> curSums = new ArrayList<>();
            for (int preSum : sumCountMap.keySet()) {
                curSums.add(preSum + num);
            }
            for (int curSum : curSums) {
                sumCountMap.put(curSum, sumCountMap.getOrDefault(curSum, 0) + 1);
            }
        }
        return sumCountMap.getOrDefault(k, 0);
    }
}
