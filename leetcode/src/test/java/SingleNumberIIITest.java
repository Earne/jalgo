import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleNumberIIITest {

    @Test
    public void testSingleNumber() throws Exception {
        SingleNumberIII s = new SingleNumberIII();
        assertArrayEquals(new int[]{3, 5}, s.singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
    }
}