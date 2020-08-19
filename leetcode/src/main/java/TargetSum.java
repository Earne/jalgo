import java.util.HashMap;
import java.util.Map;

/**
 * @author gengyuanzhen
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int tar) {
        // int sum = IntStream.of(nums).sum();
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // 用于记录此前得到的sum值及次数
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(nums[0], 1);
        sumMap.put(-nums[0], sumMap.getOrDefault(-nums[0], 0) + 1);
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            Map<Integer, Integer> curMap = new HashMap<>();
            for (Integer preSum : sumMap.keySet()) {
                curMap.put(preSum + cur, curMap.getOrDefault(preSum + cur, 0) + sumMap.get(preSum));
                curMap.put(preSum - cur, curMap.getOrDefault(preSum - cur, 0) + sumMap.get(preSum));
            }
            sumMap = curMap;
        }
        return sumMap.getOrDefault(tar, 0);
    }
}
