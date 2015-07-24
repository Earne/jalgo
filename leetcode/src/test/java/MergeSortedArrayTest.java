import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArrayTest {
    MergeSortedArray s = new MergeSortedArray();

    @Test
    public void testMerge() throws Exception {
        int[] a1 = new int[]{0, 0, 0, 0, 0};
        int[] a2 = new int[]{2, 3, 4, 5, 6};
        s.merge(a1, 0, a2, 5);
        assertArrayEquals(a2, a1);

        int[] a3 = new int[]{0, 0, 0, 0, 0};
        int[] a4 = new int[]{2, 3, 5, 6};
        s.merge(a3, 1, a4, 4);
        assertArrayEquals(new int[]{0, 2, 3, 5, 6}, a3);
    }

    @Test
    public void testMerge2() throws Exception {
        int[] a1 = new int[]{0, 0, 0, 0, 0};
        int[] a2 = new int[]{2, 3, 4, 5, 6};
        s.merge2(a1, 0, a2, 5);
        assertArrayEquals(a2, a1);

        int[] a3 = new int[]{0, 0, 0, 0, 0};
        int[] a4 = new int[]{2, 3, 5, 6};
        s.merge2(a3, 1, a4, 4);
        assertArrayEquals(new int[]{0, 2, 3, 5, 6}, a3);
    }
}