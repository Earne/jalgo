/**
 * Created by earne on 6/18/15.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode p = null;
        ListNode q = head;
        ListNode tmp;
        while (q.next != null) {
            tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        q.next = p;
        return q;
    }
}
