import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/21/15.
 */
public class PermutationsTest {

    @Test
    public void testPermute() throws Exception {
        Permutations s = new Permutations();
        int[] a = {5, 4, 6, 2};
        System.out.println(s.permute(a));
    }
}