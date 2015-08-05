import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {

    @Test
    public void testIsAnagram() throws Exception {
        ValidAnagram s = new ValidAnagram();
        assertEquals(true, s.isAnagram("anagram", "nagaram"));
        assertEquals(false, s.isAnagram("rat", "car"));
    }
}