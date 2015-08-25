/**
 * 翻转链表
 * 翻转一个链表
 * 样例
 * <p/>
 * 给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 * 挑战
 * <p/>
 * 在原地一次翻转完成
 */
public class ReverseLinkedList {
    /**
     * @param head: The head of linked list.
     * @return listNode: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if (head == null)
            return null;
        ListNode p = null;
        ListNode q = head;

        while (q.next != null) {
            ListNode tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        q.next = p;
        return q;
    }
}
