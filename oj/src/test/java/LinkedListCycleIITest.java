import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListCycleIITest {

    @Test
    public void testDetectCycle() throws Exception {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a3;

        LinkedListCycleII s = new LinkedListCycleII();
        assertEquals(a3, s.detectCycle(a1));
    }
}