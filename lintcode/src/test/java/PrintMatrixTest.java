import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrintMatrixTest {

    @Test
    public void testPrintMatrix() throws Exception {
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] b = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] c = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] d = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] e = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] f = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        PrintMatrix s = new PrintMatrix();
        assertEquals(
                Arrays.asList(new Integer[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}),
                s.printMatrix(a));

        System.out.println(s.printMatrix(b));
        System.out.println(s.printMatrix(c));
        System.out.println(s.printMatrix(d));
        System.out.println(s.printMatrix(e));
        System.out.println(s.printMatrix(f));
    }
}