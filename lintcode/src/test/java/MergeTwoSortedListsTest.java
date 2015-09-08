import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists() throws Exception {
        MergeTwoSortedLists s = new MergeTwoSortedLists();
        int[] a1 = {1, 3, 4};
        int[] a2 = {4, 5, 6};

        ListNode l1 = new ListNode(a1);
        ListNode l2 = new ListNode(a2);


        ListNode r1 = s.mergeTwoLists2(l1, l2);

        assertEquals(1, r1.val);
        assertEquals(4, r1.next.next.val);
    }
}