/**
 * Created by earne on 6/16/15.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode result = head;
        ListNode fake = new ListNode(0);
        ListNode tmp;
        fake.next = head;
        if (head != null && head.next != null)
            result = head.next;

        while (fake.next != null && fake.next.next != null) {
            tmp = fake.next;
            fake.next = fake.next.next;
            tmp.next = fake.next.next;
            fake.next.next = tmp;
            fake = fake.next.next;
        }
        return result;
    }
}
