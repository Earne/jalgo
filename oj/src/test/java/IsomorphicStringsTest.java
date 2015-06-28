import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsomorphicStringsTest {

    @Test
    public void testIsIsomorphic() throws Exception {
        IsomorphicStrings s = new IsomorphicStrings();

        assertEquals(false, s.isIsomorphic("ab", "aa"));
        assertEquals(true, s.isIsomorphic("egg", "add"));
        assertEquals(false, s.isIsomorphic("foo", "bar"));
        assertEquals(true, s.isIsomorphic("paper", "title"));
    }
}