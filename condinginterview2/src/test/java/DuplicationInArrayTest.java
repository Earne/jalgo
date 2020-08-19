import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class DuplicationInArrayTest {

    @Test
    public void findDup() {
        assertEquals(2, new DuplicationInArray().findDup(new int[]{2, 3, 1, 0, 2, 5, 3}));
        assertEquals(1, new DuplicationInArray().findDup(new int[]{2, 1, 3, 1, 4}));
        assertEquals(4, new DuplicationInArray().findDup(new int[]{2, 4, 3, 1, 4}));
        assertEquals(2, new DuplicationInArray().findDup(new int[]{2, 4, 2, 1, 4}));
        assertEquals(-1, new DuplicationInArray().findDup(new int[]{2, 1, 3, 0, 4}));
    }
}