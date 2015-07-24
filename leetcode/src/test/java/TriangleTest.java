import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    // TODO redisign test
    @Test
    public void testMinimumTotal() throws Exception {
        Triangle s = new Triangle();
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        l.add(Collections.singletonList(2));
        l.add(Arrays.asList(3, 4));
        l.add(Arrays.asList(6, 5, 7));
        l.add(Arrays.asList(4, 1, 8, 3));
        assertEquals(11, s.minimumTotal(l));
    }
}