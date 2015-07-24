import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnTitleTest {

    @Test
    public void testConvertToTitle() throws Exception {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("AA", s.convertToTitle(27));
        assertEquals("Z", s.convertToTitle(26));
        assertEquals("A", s.convertToTitle(1));
    }
}