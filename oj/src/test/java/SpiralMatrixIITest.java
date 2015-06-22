import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/22/15.
 */
public class SpiralMatrixIITest {

    @Test
    public void testGenerateMatrix() throws Exception {
        SpiralMatrixII s = new SpiralMatrixII();
        int[][] r = s.generateMatrix2(4);
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}