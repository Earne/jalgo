import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PartitionArrayByOddAndEvenTest {

    @Test
    public void testPartitionArray() throws Exception {
        PartitionArrayByOddAndEven s = new PartitionArrayByOddAndEven();
        int[] nums = new int[]{1, 2, 3, 4};
        s.partitionArray(nums);
        assertArrayEquals(new int[]{1, 3, 2, 4}, nums);
    }
}