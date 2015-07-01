import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        ValidPalindrome s = new ValidPalindrome();
        assertEquals(true, s.isPalindrome(null));
        assertEquals(true, s.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, s.isPalindrome("race a car"));
        assertEquals(true, s.isPalindrome(",."));
    }

    @Test
    public void testIsPalindrome2() throws Exception {
        ValidPalindrome s = new ValidPalindrome();
        assertEquals(true, s.isPalindrome2(null));
        assertEquals(true, s.isPalindrome2("A man, a plan, a canal: Panama"));
        assertEquals(false, s.isPalindrome2("race a car"));
        assertEquals(true, s.isPalindrome2(",."));
    }

    @Test
    public void testIsPalindrome3() throws Exception {
        ValidPalindrome s = new ValidPalindrome();
        assertEquals(true, s.isPalindrome3(null));
        assertEquals(true, s.isPalindrome3("A man, a plan, a canal: Panama"));
        assertEquals(false, s.isPalindrome3("race a car"));
        assertEquals(true, s.isPalindrome3(",."));
    }
}