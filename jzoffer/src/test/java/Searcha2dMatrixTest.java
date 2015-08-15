import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Searcha2dMatrixTest {

    @Test
    public void testSearchMatrix() throws Exception {
        Searcha2dMatrix s = new Searcha2dMatrix();
        assertEquals(true, s.searchMatrix(new int[][]{{1, 2}}, 2));
        assertEquals(true, s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 16));
        assertEquals(false, s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 15));
        assertEquals(false, s.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 90));
    }
}