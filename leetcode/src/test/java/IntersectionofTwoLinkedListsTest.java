import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntersectionofTwoLinkedListsTest {

    @Test
    public void testGetIntersectionNode() throws Exception {
        //TODO redesign this test

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(4);
        ListNode a6 = new ListNode(4);
        ListNode a7 = new ListNode(4);

        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);
        a4.setNext(a5);
        a6.setNext(a7);
        a7.setNext(a3);

        IntersectionofTwoLinkedLists s = new IntersectionofTwoLinkedLists();
        assertEquals(a3, s.getIntersectionNode(a1, a6));
    }
}