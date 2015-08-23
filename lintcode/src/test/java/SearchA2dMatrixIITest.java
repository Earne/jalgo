import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchA2dMatrixIITest {

    @Test
    public void testSearchMatrix() throws Exception {
        SearchA2dMatrixII s = new SearchA2dMatrixII();
        assertEquals(2, s.searchMatrix(new int[][]{{1, 3, 5, 7}, {2, 4, 7, 8}, {3, 5, 9, 10}}, 3));
        assertEquals(1, s.searchMatrix(new int[][]{{3, 4}}, 3));
        assertEquals(0, s.searchMatrix(new int[][]{}, 1));
        assertEquals(5, s.searchMatrix(
                new int[][]{
                        {62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                        {63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81},
                        {64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82},
                        {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83},
                        {66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84},
                        {67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85}
                }, 81));
    }
}