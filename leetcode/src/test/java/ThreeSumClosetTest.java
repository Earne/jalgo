import junit.framework.TestCase;

public class ThreeSumClosetTest extends TestCase {

    public void testThreeSumClosest() throws Exception {
        ThreeSumCloset s = new ThreeSumCloset();
        assertEquals(2, s.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}