import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectRopesTest {

    @Test
    public void minimumCostToConnectRopes() {
        int result1 = new ConnectRopes().minimumCostToConnectRopes(new int[]{1, 3, 11, 5, 2});
        assertEquals(42, result1);

    }
}
