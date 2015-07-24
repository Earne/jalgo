import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ProductofArrayExceptSelfTest {

    @Test
    public void testProductExceptSelf() throws Exception {
        ProductofArrayExceptSelf s = new ProductofArrayExceptSelf();
        assertArrayEquals(new int[]{24, 12, 8, 6}, s.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}