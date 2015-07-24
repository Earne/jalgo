import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchinRotatedSortedArrayTest {

    @Test
    public void testSearch() throws Exception {
        SearchinRotatedSortedArray s = new SearchinRotatedSortedArray();
        assertEquals(2, s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));
        assertEquals(-1, s.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 8));
    }
}