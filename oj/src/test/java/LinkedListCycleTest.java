import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by earne on 6/10/15.
 */
public class LinkedListCycleTest {

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);



    @Test
    public void testHasCycle() throws Exception {
        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a1);

        assertEquals(true, a1);
        assertEquals(false, a3);

    }
}