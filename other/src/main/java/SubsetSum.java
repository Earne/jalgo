/**
 * @author gengyuanzhen
 */
public class SubsetSum {
    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
        int[] num = {1, 2, 3, 7};
        System.out.println(ss.canPartition(num, 6));
        num = new int[]{1, 2, 7, 1, 5};
        System.out.println(ss.canPartition(num, 10));
        num = new int[]{1, 3, 4, 8};
        System.out.println(ss.canPartition(num, 6));
    }

    public boolean canPartition(int[] nums, int target) {
        return canPartition(nums, target, 0);
    }

    private boolean canPartition(int[] nums, int target, int index) {
        if (target == 0) {
            return true;
        }
        if (index < 0 || index >= nums.length) {
            return false;
        }
        boolean withCur = false;
        if (nums[index] <= target) {
            withCur = canPartition(nums, target - nums[index], index + 1);
        }
        boolean withOutCur = canPartition(nums, target, index + 1);
        return withCur || withOutCur;
    }
}
