import org.junit.Test;

public class ThreeSumTest {

    @Test
    public void testThreeSum() throws Exception {
        ThreeSum s = new ThreeSum();
        System.out.println(s.threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(s.threeSum3(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}));
        System.out.println(s.threeSum3(new int[]{0,-4,-1,-4,-2,-3,2}));
    }
}
