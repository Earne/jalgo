import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by earne on 9/19/15.
 */
public class Meituan_BTest {

    @Test
    public void testArrayPrint() throws Exception {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        Meituan_B s = new Meituan_B();
        int[] res = s.arrayPrint(arr, 4);
        assertArrayEquals(new int[]{4, 3, 8, 2, 7, 12, 1, 6, 11, 16, 5, 10, 15, 9, 14, 13}, res);
        System.out.println(Arrays.toString(res));
    }
}