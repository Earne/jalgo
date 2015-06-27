import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {

    @Test
    public void testPlusOne() throws Exception {
        int[] a = {1, 2, 3, 4};
        PlusOne s = new PlusOne();
        s.plusOne(a);
        assertEquals(5, a[3]);
        int[] a2 = {1, 2, 9, 9};
        s.plusOne(a2);
        assertEquals(3, a2[1]);
        assertEquals(0, a2[2]);

        int[] a3 = {9, 9, 9};
        a3 = s.plusOne(a3);
        assertEquals(1, a3[0]);
        assertEquals(0, a3[2]);
    }
}