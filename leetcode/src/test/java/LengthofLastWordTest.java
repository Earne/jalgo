import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthofLastWordTest {

    @Test
    public void testLengthOfLastWord() throws Exception {
        LengthofLastWord s = new LengthofLastWord();
        assertEquals(0, s.lengthOfLastWord(""));
        assertEquals(1, s.lengthOfLastWord("a"));
        assertEquals(1, s.lengthOfLastWord("a "));
        assertEquals(5, s.lengthOfLastWord("hello World"));
    }
}