import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author gengyuanzhen
 */
public class ReorderListTest {

    @Test
    public void reorderList() {
        ListNode la = new ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode lb = new ListNode(new int[]{1, 2, 3, 4});
        new ReorderList().reorderList(la);
        assertEquals("1,5,2,4,3,", la.toString());
        new ReorderList().reorderList(lb);
        assertEquals("1,4,2,3,", lb.toString());
    }
}
