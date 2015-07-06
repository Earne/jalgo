import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindrome() throws Exception {
        PalindromeNumber s = new PalindromeNumber();
        assertEquals(true, s.isPalindrome(10001));
        assertEquals(true, s.isPalindrome(321000123));
        assertEquals(true, s.isPalindrome(32100123));
        assertEquals(false, s.isPalindrome(310123));
    }
}