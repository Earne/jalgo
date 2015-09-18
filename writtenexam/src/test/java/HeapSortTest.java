import org.junit.Test;

import java.util.Arrays;

/**
 * Created by earne on 9/17/15.
 */
public class HeapSortTest {
    @Test
    public void testHeapSort() throws Exception {
        int[] arr = new int[]{5, 3, 6, 2, 1, 9, 4, 8, 7};
        HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}