import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/21/15.
 */
public class RotateImageTest {

    @Test
    public void testRotate() throws Exception {
        int[][] a = {{1, 2}, {3, 4}};
        RotateImage s = new RotateImage();
        s.rotate(a);
        assertEquals(3, a[0][0]);
        assertEquals(1, a[0][1]);
        assertEquals(2, a[1][1]);
    }
}