package ernest;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();
        assertEquals(2, instance.removeDuplicates(new int[]{1, 1, 2}));
        assertEquals(5, instance.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}