import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and an integer k,
 * find out whether there there are two distinct indices i and j in the array
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k + 1) {
                if (set.contains(nums[i]))
                    return true;
                else
                    set.add(nums[i]);
            } else {
                set.remove(nums[i - k - 1]);
                if (set.contains(nums[i])) {
                    return true;
                } else
                    set.add(nums[i]);
            }
        }
        return false;
    }
}
