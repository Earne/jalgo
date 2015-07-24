import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/13/15.
 */
public class ClimbingStairsTest {

    @Test
    public void testClimbStairs() throws Exception {
        ClimbingStairs s = new ClimbingStairs();
        assertEquals(3, s.climbStairs(3));
    }
}