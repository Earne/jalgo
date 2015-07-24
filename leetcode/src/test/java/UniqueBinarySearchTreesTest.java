import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/11/15.
 */
public class UniqueBinarySearchTreesTest {

    @Test
    public void testNumTrees() throws Exception {
        UniqueBinarySearchTrees s = new UniqueBinarySearchTrees();
        assertEquals(1, s.numTrees(1));
        assertEquals(2, s.numTrees(2));
        assertEquals(5, s.numTrees(3));
        assertEquals(14, s.numTrees(4));
    }
}