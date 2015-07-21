import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIITest {

    @Test
    public void testRob() throws Exception {
        HouseRobberII s = new HouseRobberII();
        assertEquals(16, s.rob(new int[]{5, 3, 5, 4, 6, 7}));
        assertEquals(11, s.rob(new int[]{1, 3, 5, 4, 6}));
        assertEquals(1, s.rob(new int[]{1}));
        assertEquals(3, s.rob(new int[]{1, 1, 1, 2}));
        assertEquals(10, s.rob(new int[]{2, 2, 4, 3, 2, 5}));
    }
}