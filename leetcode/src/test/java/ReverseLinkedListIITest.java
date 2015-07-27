import org.junit.Test;

public class ReverseLinkedListIITest {

    @Test
    public void testReverseBetween() throws Exception {
        ListNode a = new ListNode(new int[]{1, 2, 3, 4, 5});
        ReverseLinkedListII s = new ReverseLinkedListII();
        a = s.reverseBetween(a, 2, 4);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }
}