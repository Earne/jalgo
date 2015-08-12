import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void testThreeSum() throws Exception {
        ThreeSum s = new ThreeSum();
        System.out.println(s.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}