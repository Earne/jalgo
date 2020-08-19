import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {

    @Test
    public void canPartition() {
        boolean result = new PartitionEqualSubsetSum().canPartition(new int[]{23, 13, 11, 7, 6, 5, 5});
        System.out.println(result);
    }
}
