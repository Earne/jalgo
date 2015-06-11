import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() throws Exception {
        SearchInsertPosition s = new SearchInsertPosition();
        int[] a = {1, 3, 5, 6};
        assertEquals(2, s.searchInsert(a, 5));
        assertEquals(2, s.searchInsert(a, 4));
        assertEquals(0, s.searchInsert(a, 0));
        assertEquals(4, s.searchInsert(a, 7));
    }
}