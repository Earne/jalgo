import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    @Test
    public void testAddBinary() throws Exception {
        AddBinary s = new AddBinary();
        assertEquals("100", s.addBinary("11", "1"));
        assertEquals("0", s.addBinary("0", "0"));
        assertEquals("1000", s.addBinary("1", "111"));
    }

    @Test
    public void testAddBinary2() throws Exception {
        AddBinary s = new AddBinary();
        assertEquals("100", s.addBinary2("11", "1"));
        assertEquals("0", s.addBinary2("0", "0"));
        assertEquals("1000", s.addBinary2("1", "111"));
    }
}