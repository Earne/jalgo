import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by earne on 9/26/15.
 */
public class Iqiy_ATest {

    @Test
    public void testFoo() throws Exception {
        assertEquals(98, Iqiy_A.foo("kabciedkiadd"));
        assertEquals(98, Iqiy_A.foo("abcadc"));
    }
}