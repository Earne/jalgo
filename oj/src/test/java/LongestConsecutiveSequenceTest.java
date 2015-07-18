import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    public void testLongestConsecutive() throws Exception {
        LongestConsecutiveSequence s = new LongestConsecutiveSequence();
        assertEquals(4, s.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}