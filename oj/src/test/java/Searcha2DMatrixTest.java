import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/24/15.
 */
public class Searcha2DMatrixTest {

    @Test
    public void testSearchMatrix() throws Exception {
        Searcha2DMatrix s = new Searcha2DMatrix();
        int[][] a = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        assertEquals(true, s.searchMatrix(a, 3));
        assertEquals(false, s.searchMatrix(a, 15));
    }
}