import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchinRotatedSortedArrayIITest {

    @Test
    public void testSearch() throws Exception {
        SearchinRotatedSortedArrayII s = new SearchinRotatedSortedArrayII();
        assertEquals(true, s.search(new int[]{4, 4, 5, 5, 5, 6, 7, 0, 1, 2, 3, 4, 4}, 5));
        assertEquals(false, s.search(new int[]{4, 4, 5, 5, 5, 6, 7, 0, 1, 2, 3, 4, 4}, 8));
        assertEquals(true, s.search(new int[]{1, 3}, 3));
        assertEquals(true, s.search(new int[]{3, 5, 1}, 1));
    }
}