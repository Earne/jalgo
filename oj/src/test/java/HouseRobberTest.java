import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberTest {

    @Test
    public void testRob() throws Exception {
        HouseRobber s = new HouseRobber();
        assertEquals(1, s.rob(new int[]{1}));
        assertEquals(3, s.rob(new int[]{1, 3}));
        assertEquals(6, s.rob(new int[]{1, 3, 5}));
        assertEquals(12, s.rob(new int[]{1, 3, 5, 2, 4, 6}));
    }

    @Test
    public void testRob2() throws Exception {
        HouseRobber s = new HouseRobber();
        assertEquals(1, s.rob2(new int[]{1}));
        assertEquals(3, s.rob2(new int[]{1, 3}));
        assertEquals(6, s.rob2(new int[]{1, 3, 5}));
        assertEquals(12, s.rob2(new int[]{1, 3, 5, 2, 4, 6}));
    }
}