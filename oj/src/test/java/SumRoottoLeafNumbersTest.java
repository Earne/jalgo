import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumRoottoLeafNumbersTest {

    @Test
    public void testSumNumbers() throws Exception {
        SumRoottoLeafNumbers s = new SumRoottoLeafNumbers();
        Integer[] a = {1, 2, 3};
        BinaryTree ta = new BinaryTree(a);
        assertEquals(25, s.sumNumbers(ta.getRoot()));
    }
}