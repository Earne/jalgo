import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class HindexTest {

    @Test
    public void hIndex() {
        int result = new Hindex().hIndex(new int[]{1, 20, 20});
        assertEquals(2, result);
    }
}
