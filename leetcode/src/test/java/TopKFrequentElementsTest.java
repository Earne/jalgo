import org.junit.Test;

import static org.junit.Assert.*;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {
        int[] result = new TopKFrequentElements().topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        System.out.println(result);
    }
}
