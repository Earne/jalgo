import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/16/15.
 */
public class GenerateParenthesesTest {

    @Test
    public void testGenerateParenthesis() throws Exception {
        GenerateParentheses s = new GenerateParentheses();
        System.out.println(s.generateParenthesis(3));
    }
}