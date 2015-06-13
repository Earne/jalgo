import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class GrayCodeTest {

    @Test
    public void testGrayCode() throws Exception {
        GrayCode s = new GrayCode();
        Integer[] a1 = {0, 1, 3, 2};
        assertEquals(Arrays.asList(a1), s.grayCode(2));

    }
}