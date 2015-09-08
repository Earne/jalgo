import org.junit.Test;

public class RemoveNthNodeFromEndofListTest {

    @Test
    public void testRemoveNthFromEnd() throws Exception {
        RemoveNthNodeFromEndofList s = new RemoveNthNodeFromEndofList();
        ListNode a = new ListNode(new int[]{1, 2, 3, 4, 5});
        ListNode a2 = new ListNode(new int[]{1});
        a = s.removeNthFromEnd(a, 2);
        a2 = s.removeNthFromEnd(a2, 1);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }

        System.out.println("****");
        while (a2 != null) {
            System.out.println(a2.val);
            a2 = a2.next;
        }
    }
}