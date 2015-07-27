/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * <p/>
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * <p/>
 * return 1->4->3->2->5->NULL.
 * <p/>
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode f = fake;
        for (int i = 1; i < m; i++) {
            f = f.next;
        }
        ListNode p = f;
        ListNode q = p.next;
        ListNode back = q;
        ListNode tmp;
        for (int i = m; i <= n; i++) {
            tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        f.next = p;
        back.next = q;
        return fake.next;
    }

    // TODO refactor this
}
