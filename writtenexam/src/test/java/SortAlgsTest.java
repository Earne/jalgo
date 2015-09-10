import org.junit.Test;

import java.util.Arrays;

/**
 * Created by earne on 9/9/15.
 */
public class SortAlgsTest {

    @Test
    public void testQuickSort() throws Exception {
        int[] arr = new int[]{1, 3, 2, 4, 8, 7, 6};
        SortAlgs.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}