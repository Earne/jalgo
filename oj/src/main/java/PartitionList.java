/**
 * Given a linked list and a value x,
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode p = fake, q = fake;

        while (q.next != null) {
            while (p.next != null && p.next.val < x)
                p = p.next;
            q = p.next;
            if (q == null)
                break;
            while (q.next != null && q.next.val >= x)
                q = q.next;
            if (q.next == null)
                break;
            ListNode tmp = q.next;
            q.next = q.next.next;
            tmp.next = p.next;
            p.next = tmp;
        }

        return fake.next;
    }

    // TODO refactor this
}
