import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctSubsequencesTest {

    @Test
    public void testNumDistinct() throws Exception {
        DistinctSubsequences s = new DistinctSubsequences();
        assertEquals(3, s.numDistinct("rabbbit", "rabbit"));
    }
}