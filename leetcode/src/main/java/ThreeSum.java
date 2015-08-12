import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.

 Note:

 Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 The solution set must not contain duplicate triplets.

 For example, given array S = {-1 0 1 2 -1 -4},

 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)

 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            int sum;
            while (j < k) {
                List<Integer> curSolu = new ArrayList<>();
                sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    curSolu.add(nums[i]);
                    curSolu.add(nums[j]);
                    curSolu.add(nums[k]);
                    res.add(curSolu);
                    ++j;
                    --k;
                    while (j < k && nums[j - 1] == nums[j])
                        ++j;
                    while (j < k && nums[k] == nums[k + 1])
                        --k;
                } else if (sum < 0)
                    ++j;
                else
                    --k;
            }
            while (i < nums.length - 1 && nums[i] == nums[i + 1])
                ++i;
        }
        return res;
    }
}
