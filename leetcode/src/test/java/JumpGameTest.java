import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGameTest {

    @Test
    public void testCanJump() throws Exception {
        JumpGame s = new JumpGame();
        assertEquals(true, s.canJump(new int[]{0}));
        assertEquals(true, s.canJump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(false, s.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}