import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author gengyuanzhen
 */
public class ReplaceSpacesTest {

    @Test
    public void trans() {
        ReplaceSpaces instance = new ReplaceSpaces();
        assertEquals("%20helloworld", instance.trans(" helloworld".toCharArray()));
        assertEquals("helloworld%20", instance.trans("helloworld ".toCharArray()));
        assertEquals("hello%20world%20", instance.trans("hello world ".toCharArray()));
    }
}