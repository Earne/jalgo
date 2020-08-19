import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.ArrayList;
import java.util.List;

public class FirstKMissingPositive {
    public static List<Integer> findNumbers(int[] nums, int k) {
        List<Integer> missingNumbers = new ArrayList<>();
        if (nums == null) {
            for (int i = 1; i <= k; i++) {
                missingNumbers.add(i);
            }
            return missingNumbers;
        }
        int i = 0;
        while (i < nums.length) {
            int curVal = nums[i];
            if (curVal <= 0 || curVal > nums.length) {
                i++;
            } else {
                if (nums[curVal - 1] == curVal) {
                    i++;
                } else {
                    swap(nums, i, curVal - 1);
                }
            }
        }

        for (i = 0;  i < nums.length ; i++) {

        }

        return missingNumbers;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
