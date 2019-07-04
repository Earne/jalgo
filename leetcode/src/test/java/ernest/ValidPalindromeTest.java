package ernest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() {
        ValidPalindrome s = new ValidPalindrome();
        assertTrue(s.isPalindrome(null));
        assertTrue(s.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(s.isPalindrome("race a car"));
        assertTrue(s.isPalindrome(",."));
        assertFalse(s.isPalindrome("0P"));
    }
}