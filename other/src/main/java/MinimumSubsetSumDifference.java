import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * @author gengyuanzhen
 */
public class MinimumSubsetSumDifference {
    public static void main(String[] args) {
        MinimumSubsetSumDifference ps = new MinimumSubsetSumDifference();
        int[] num = {1, 2, 3, 9};
        System.out.println(ps.canPartition(num));
        num = new int[]{1, 2, 7, 1, 5};
        System.out.println(ps.canPartition(num));
        num = new int[]{1, 3, 100, 4};
        System.out.println(ps.canPartition(num));
    }

    private int canPartition(int[] nums) {
        int sum = IntStream.of(nums).sum();
        // treeSet 记录可以达到的不超过num加和一半的数值
        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);
        for (int num : nums) {
            Set<Integer> curSumSet = new HashSet<>();
            for (Integer preSum : treeSet) {
                if (preSum + num <= sum / 2) {
                    curSumSet.add(preSum + num);
                }
            }
            treeSet.addAll(curSumSet);
        }

        return (sum - treeSet.last()) - treeSet.last();
    }
}
