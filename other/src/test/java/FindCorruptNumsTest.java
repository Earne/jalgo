import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class FindCorruptNumsTest extends TestCase {

    public void testFindNumbers() {
        assertArrayEquals(new int[]{4, 2}, FindCorruptNums.findNumbers(new int[]{3, 1, 2, 5, 2}));
    }
}
