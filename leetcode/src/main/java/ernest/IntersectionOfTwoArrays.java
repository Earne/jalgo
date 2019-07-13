package ernest;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * Easy
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 *
 * Note:
 *
 *     Each element in the result must be unique.
 *     The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<>();
        int[] res;
        if (nums1 == null || nums2 == null) {
            return null;
        }

        Set<Integer> set = new HashSet<>();

        for (int i : nums1){
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                resSet.add(i);
            }
        }
        res = new int[resSet.size()];
        int index = 0;
        for (Integer i : resSet) {
            res[index++] = i;
        }
        return res;
    }
}
