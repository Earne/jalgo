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
        QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        QuickSort.quickSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}