import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() throws Exception {
        String[] strs = new String[]{"aabbb", "aabab", "aabcb"};
        LongestCommonPrefix s = new LongestCommonPrefix();
        assertEquals("aab", s.longestCommonPrefix(strs));
    }
}