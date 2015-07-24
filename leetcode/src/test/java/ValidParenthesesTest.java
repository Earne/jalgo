import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() throws Exception {
        ValidParentheses s = new ValidParentheses();
        assertEquals(true, s.isValid("{}[][()]"));
    }
}