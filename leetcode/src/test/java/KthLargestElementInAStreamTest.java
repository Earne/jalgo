import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class KthLargestElementInAStreamTest {

    @Test
    public void add() {
        KthLargestElementInAStream kthStream = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        int res = kthStream.add(3);
        assertEquals(4, res);

    }
}
