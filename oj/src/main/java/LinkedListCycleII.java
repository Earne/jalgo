/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head, q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q)
                break;
        }

        if (q == null || q.next == null)
            return null;

        p = head;

        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
