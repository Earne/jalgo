import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

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

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        // 存储数字及出现次数
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
//        TreeSet<Integer> keys = new TreeSet<>(map.keySet());
//        for (Integer k : keys) {
//            if (map.get(k) == 1) {
//                map.remove(k);
//            }
//            for (Integer p : map.keySet()) {
//                int q = -k - p;
//                if (q <= p) {
//                    continue;
//                }
//                int qc = map.getOrDefault(q, 0);
//                if (qc > 1 || (q != p && qc == 1)) {
//                    List<Integer> cur = new ArrayList<>();
//                    cur.add(k);
//                    cur.add(p);
//                    cur.add(q);
//                    res.add(cur);
//                }
//            }
//            map.remove(k);
//        }


        return res;
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        // 数字及出现次数
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, numMap.get(num) + 1);
            }
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int required = 0 - (nums[i] + nums[j]);
                if (required < nums[j]) {
                    break;
                }
                if (numMap.containsKey(required)) {
                    int times = numMap.get(required);
                    if (required == nums[i]) {
                        times--;
                    }
                    if (required == nums[j]) {
                        times--;
                    }
                    if (times > 0) {
                        List<Integer> cur = Arrays.asList(nums[i], nums[j], required);
                        result.add(cur);
                    }
                }
            }
        }

        return result;
    }

    public static boolean checkInclusion(String patt, String str) {
        if (str == null || patt == null) {
            return true;
        }
        if (str.length() < patt.length()) {
            return false;
        }
        // char and its times in patt minus times in str; remove while zero
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < patt.length(); i++) {
            map.put(patt.charAt(i), map.getOrDefault(patt.charAt(i), 0) + 1);
        }

        int p = 0;
        for (int q = 0; q < str.length(); q++){

            if (q >= patt.length()) {
                map.put(str.charAt(p), map.getOrDefault(str.charAt(p), 0) + 1);
                if (map.get(str.charAt(p)) == 0) {
                    map.remove(str.charAt(p));
                }
                p++;
            }
            map.put(str.charAt(q), map.getOrDefault(str.charAt(q), 0) - 1);
            if (map.get(str.charAt(q)) == 0) {
                map.remove(str.charAt(q));
            }
            if (q >= patt.length() - 1 && map.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion(
                "ab",
                "eidbaooo"));
        System.out.println(checkInclusion(
                "adc",
                "dcda"));
        System.out.println(checkInclusion(
                "ab",
                "eidboaoo"));
    }
}
