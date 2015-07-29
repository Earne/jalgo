import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleAreaTest {

    @Test
    public void testComputeArea() throws Exception {
        RectangleArea s = new RectangleArea();
        assertEquals(45, s.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}