import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CourseScheduleIITest {

    @Test
    public void testFindOrder() throws Exception {
        CourseScheduleII s = new CourseScheduleII();
//        assertArrayEquals(new int[]{0, 1}, s.findOrder(2, new int[][]{{1, 0}}));
//        assertArrayEquals(new int[]{0, 1, 2, 3}, s.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3,
//                1}, {3, 2}}));
        assertArrayEquals(new int[]{}, s.findOrder(2, new int[][]{{0, 1}, {1, 0}}));
    }
}