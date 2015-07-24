import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * <p>
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();

        if (nums == null || nums.length == 0)
            return result;

        if (nums.length == 1) {
            result.add("" + nums[0]);
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            int begin = nums[i];
            while (i < nums.length - 1 && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            if (begin == nums[i]) {
                result.add("" + begin);
            } else {
                result.add("" + begin + "->" + nums[i]);
            }
        }
        return result;
    }
}
