import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void testRotate() throws Exception {
        RotateArray s = new RotateArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        s.rotate(a, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, a);
    }
}