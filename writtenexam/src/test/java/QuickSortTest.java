import org.junit.Test;

import java.util.Arrays;

/**
 * Created by earne on 9/9/15.
 */
public class QuickSortTest {

    @Test
    public void testQuickSort() throws Exception {
        int[] arr = new int[]{1, 3, 2, 4, 8, 7, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        QuickSort.quickSort(arr);
        qs(arr);
        System.out.println(Arrays.toString(arr));
//        QuickSort.quickSort(arr2);
        qs(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    private void qs(int[] nums) {
        helper(nums, 0, nums.length - 1);
    }

    private void helper(int[] nums, int beg, int end) {
        if (beg >= end) {
            return;
        }
        int pivot = partition(nums, beg, end);
        helper(nums, beg, pivot - 1);
        helper(nums, pivot + 1, end);
    }

    private int partition(int[] nums, int beg, int end) {
        int tar = nums[end];
        int p = beg, q = beg;
        while (q < end) {
            if (nums[q] <= tar) {
                swap(nums, p, q);
                q++;
                p++;
            } else {
                q++;
            }
        }
        swap(nums, end, p);
        return p;
    }

    private void swap(int[] nums, int p, int q) {
        int tmp = nums[q];
        nums[q] = nums[p];
        nums[p] = tmp;
    }

}