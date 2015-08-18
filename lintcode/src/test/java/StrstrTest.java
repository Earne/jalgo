import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrstrTest {

    @Test
    public void testStrStr() throws Exception {
        Strstr s = new Strstr();
        assertEquals(-1, s.strStr("source", "target"));
        assertEquals(1, s.strStr("abcdabcdefg", "bcd"));
    }
}