import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinStackTest {
    @Test
    public void testMinStack() throws Exception {
        MinStack s = new MinStack();
        s.push(1);
        assertEquals(1, s.pop());
        s.push(2);
        s.push(3);
        assertEquals(2, s.min());
        s.push(1);
        assertEquals(1, s.min());
    }
}