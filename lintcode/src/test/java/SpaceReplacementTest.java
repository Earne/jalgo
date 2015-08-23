import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SpaceReplacementTest {

    @Test
    public void testReplaceBlank() throws Exception {
        char[] str1 = Arrays.copyOf("Mr John Smith".toCharArray(), 100);
        SpaceReplacement s = new SpaceReplacement();
        assertEquals(17, s.replaceBlank(str1, 13));
        System.out.println(str1);
    }
}