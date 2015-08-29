import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() throws Exception {
        ClimbingStairs s = new ClimbingStairs();
        assertEquals(3, s.climbStairs(3));
        assertEquals(5, s.climbStairs(4));
    }
}