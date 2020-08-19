import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindKClosestElementsTest {

    @Test
    public void findClosestElements() {
        List<Integer> res1 = new FindKClosestElements().findClosestElements(new int[]{1, 4}, 1, 2);
        assertEquals((int) res1.get(0), 1);
        List<Integer> res2 = new FindKClosestElements().findClosestElements(new int[]{1, 4}, 1, 3);
        assertEquals((int) res2.get(0), 4);
    }
}
