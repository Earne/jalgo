import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by earne on 6/21/15.
 */
public class Permutations {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, new Integer[nums.length], 0);
        return result;
    }

    private void helper(int[] nums, Integer[] tmp, int cur) {
        if (cur == nums.length) {
            result.add(new ArrayList<Integer>(Arrays.asList(tmp)));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            boolean isHave = false;
            for (int j = 0; j < cur; j++)
                if (tmp[j] == nums[i])
                    isHave = true;
            if (!isHave) {
                tmp[cur] = nums[i];
                helper(nums, tmp, cur + 1);
            }
        }
    }
}
