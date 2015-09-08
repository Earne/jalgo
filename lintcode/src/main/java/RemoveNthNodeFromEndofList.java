/**
 * 删除链表中倒数第n个节点
 * 给定一个链表，删除链表中倒数第n个节点，返回链表的头节点。
 * 样例
 * <p/>
 * 给出链表1->2->3->4->5->null和 n = 2.
 * <p/>
 * 删除倒数第二个节点之后，这个链表将变成1->2->3->5->null.
 * 注意
 * <p/>
 * 链表中的节点个数大于等于n
 * 挑战
 * <p/>
 * O(n)时间复杂度
 */
public class RemoveNthNodeFromEndofList {
    /**
     * @param head: The first node of linked list.
     * @param n:    An integer.
     * @return The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode p = fakeHead, q = fakeHead;

        while (n-- > 0) {
            if (q.next != null)
                q = q.next;
            else
                throw new IllegalArgumentException();
        }

        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;

        return fakeHead.next;
    }
}
