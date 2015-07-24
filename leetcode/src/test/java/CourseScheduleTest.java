import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseScheduleTest {

    @Test
    public void testCanFinish() throws Exception {
        CourseSchedule s = new CourseSchedule();

        assertEquals(true, s.canFinish(1, new int[][]{}));
        assertEquals(true, s.canFinish(2, new int[][]{{1, 0}}));
        assertEquals(false, s.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}