import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/14/15.
 */
public class SortColorsTest {

    @Test
    public void testSortColors() throws Exception {
        int[] a = {1, 2, 0, 2, 1};
        int[] r = {0, 1, 1, 2, 2};
        SortColors s = new SortColors();
        s.sortColors(a);
        assertEquals(true, Arrays.equals(r, a));
    }
}