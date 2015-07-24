import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareVersionNumbersTest {

    @Test
    public void testCompareVersion() throws Exception {
        CompareVersionNumbers s = new CompareVersionNumbers();
        assertEquals(1, s.compareVersion("1.2", "1.1"));
        assertEquals(0, s.compareVersion("1.1", "1.1"));
        assertEquals(-1, s.compareVersion("12.1", "12.1.1"));
    }
}