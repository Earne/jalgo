import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/26/15.
 */
public class SetMatrixZeroesTest {

    @Test
    public void testSetZeroes() throws Exception {
        int[][] a = {{1, 1, 3, 4}, {5, 6, 0, 7}, {0, 2, 3, 4}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        SetMatrixZeroes s = new SetMatrixZeroes();
        s.setZeroes(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}