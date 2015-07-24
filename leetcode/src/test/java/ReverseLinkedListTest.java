import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/18/15.
 */
public class ReverseLinkedListTest {

    @Test
    public void testReverseList() throws Exception {
        int[] a = {1, 2, 4, 5, 7};
        ListNode l = new ListNode(a);
        ReverseLinkedList s = new ReverseLinkedList();
        ListNode r = s.reverseList(l);
        assertEquals(7, r.val);
        assertEquals(5, r.next.val);
    }
}