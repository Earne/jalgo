package ernest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleTest {

    @Test
    public void convertToTitle() {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("AA", s.convertToTitle(27));
        assertEquals("Z", s.convertToTitle(26));
        assertEquals("A", s.convertToTitle(1));
    }
}