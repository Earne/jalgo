import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumTest {

    @Test
    public void testCombinationSum() throws Exception {
        CombinationSum s = new CombinationSum();
        System.out.println(s.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }
}