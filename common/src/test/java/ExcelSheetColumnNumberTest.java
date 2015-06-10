import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/10/15.
 */
public class ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() throws Exception {
        assertEquals(1, "A");
        assertEquals(26, "Z");
        assertEquals(27, "AA");
    }
}