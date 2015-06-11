import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class NQueensIITest {

    @Test
    public void testTotalNQueens() throws Exception {
        NQueensII s = new NQueensII();
        assertEquals(1, s.totalNQueens(1));
    }
}