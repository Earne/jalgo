import org.junit.Test;

public class RemoveNthNodeFromEndofListTest {

    // TODO redesign test
    @Test
    public void testRemoveNthFromEnd() throws Exception {
        ListNode a = new ListNode(new int[]{1, 2, 3, 4, 5});
        RemoveNthNodeFromEndofList s = new RemoveNthNodeFromEndofList();
        s.removeNthFromEnd(a, 2);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}