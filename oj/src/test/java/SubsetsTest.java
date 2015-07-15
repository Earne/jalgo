import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsTest {

    @Test
    public void testSubsets() throws Exception {
        Subsets s = new Subsets();
        System.out.println(s.subsets(new int[]{1, 2, 3}));
        System.out.println(s.subsets2(new int[]{1, 2, 3}));
    }
}