import java.util.stream.IntStream;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = IntStream.of(nums).sum();
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        // 行为当前遍历到的数字index， 列为可能的加和
        boolean[][] dp = new boolean[nums.length][target + 1];
        dp[0][0] = true;
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        int curSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum += nums[i];
            for (int s = 0; s <= curSum && s <= target; s++) {
                if (nums[i] <= s) {
                    dp[i][s] = dp[i - 1][s - nums[i]] || dp[i - 1][s];
                } else {
                    dp[i][s] = dp[i - 1][s];
                }
            }
        }
        return dp[nums.length - 1][target];
    }
}
