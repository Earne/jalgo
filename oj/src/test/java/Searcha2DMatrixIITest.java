import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Searcha2DMatrixIITest {

    @Test
    public void testSearchMatrix() throws Exception {
        int[][] a = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        Searcha2DMatrixII s = new Searcha2DMatrixII();
        assertEquals(true, s.searchMatrix(a, 5));
        assertEquals(false, s.searchMatrix(a, 20));
    }
}