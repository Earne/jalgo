import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubstringTest {

    @Test
    public void testLongestCommonSubstring() throws Exception {
        LongestCommonSubstring s = new LongestCommonSubstring();
        assertEquals(2, s.longestCommonSubstring("ABCD", "CBCE"));
        assertEquals(4, s.longestCommonSubstring("ABCDEFGHIJ", "CBCEBCDEABC"));
    }
}