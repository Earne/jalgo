import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrappingRainWaterTest {

    @Test
    public void testTrap() throws Exception {
        TrappingRainWater s = new TrappingRainWater();
        assertEquals(2, s.trap(new int[]{2, 0, 2}));
        assertEquals(1, s.trap(new int[]{5, 4, 1, 2}));
        assertEquals(14, s.trap(new int[]{5, 2, 1, 2, 1, 5}));
        assertEquals(6, s.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}