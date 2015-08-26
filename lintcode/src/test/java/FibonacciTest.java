import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testFibonacci() throws Exception {
        Fibonacci s = new Fibonacci();
        assertEquals(34, s.fibonacci(10));
    }
}