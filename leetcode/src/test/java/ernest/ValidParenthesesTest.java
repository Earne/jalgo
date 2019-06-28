package ernest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertEquals(true, validParentheses.isValid("()[]{}"));
        assertEquals(false, validParentheses.isValid("(]"));
    }
}