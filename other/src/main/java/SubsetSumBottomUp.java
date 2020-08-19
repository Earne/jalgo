/**
 * @author gengyuanzhen
 */
public class SubsetSumBottomUp {
    public static void main(String[] args) {
        SubsetSumBottomUp ss = new SubsetSumBottomUp();
        int[] num = {1, 2, 3, 7};
        System.out.println(ss.canPartition(num, 6));
        num = new int[]{1, 2, 7, 1, 5};
        System.out.println(ss.canPartition(num, 10));
        num = new int[]{1, 3, 4, 8};
        System.out.println(ss.canPartition(num, 6));
    }

    public boolean canPartition(int[] nums, int target) {
        // 记录能否达到某个加和值
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        int curSum = 0;

        for (int num : nums) {
            curSum += num;
            for (int j = Math.min(curSum, target); j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }
}
