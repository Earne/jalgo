import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SearchforaRangeTest {

    @Test
    public void testSearchRange() throws Exception {
        SearchforaRange s = new SearchforaRange();
        assertArrayEquals(new int[]{3, 4}, s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}