/**
 * 合并两个排序链表
 * 将两个排序链表合并为一个新的排序链表
 * 样例
 * <p/>
 * 给出 1->3->8->11->15->null，2->null， 返回 1->2->3->8->11->15->null。
 */
public class MergeTwoSortedLists {
    /**
     * recursive solution
     *
     * @param l1 is the head of the linked list
     * @param l2 is the head of the linked list
     * @return ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode head;
        if (l1.val < l2.val) {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        ListNode fakeHead = new ListNode(-1);
        ListNode cur = fakeHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null)
            cur.next = l1;
        else
            cur.next = l2;

        return fakeHead.next;
    }
}
