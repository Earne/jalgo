/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur;

        while (pre.next != null) {
            cur = pre.next;
            if (cur.val == val) {
                pre.next = cur.next;
                continue;
            }
            pre = cur;
        }

        return dummy.next;
    }
    // TODO add test
}
