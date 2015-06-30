import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by earne on 6/30/15.
 */
public class FactorialTrailingZeroesTest {

    @Test(timeout = 500)
    public void testTrailingZeroes() throws Exception {
        FactorialTrailingZeroes s = new FactorialTrailingZeroes();
        assertEquals(452137076, s.trailingZeroes(1808548329));
    }
}