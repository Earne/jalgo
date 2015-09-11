import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImplementstrStrTest {

    @Test
    public void testStrStr() throws Exception {
        ImplementstrStr s = new ImplementstrStr();
        assertEquals(-1, s.strStr3("baabba", "aaa"));
        assertEquals(5, s.strStr3("baabbaaabbaaa", "aaa"));
    }
}