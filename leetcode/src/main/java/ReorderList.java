/**
 * 143. Reorder List
 * https://leetcode.com/problems/reorder-list/
 * Medium
 * <p>
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p>
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 * <p>
 * Example 1:
 * <p>
 * Given 1->2->3->4, reorder it to 1->4->2->3.
 * <p>
 * Example 2:
 * <p>
 * Given 1->2->3->4->5, reorder it to 1->5->2->4->3.
 *
 * @author gengyuanzhen
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode fake = new ListNode(-1);
        fake.next = head;
        // 通过快慢指针找到中间点
        ListNode slow = fake, fast = fake;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 从slow下一个点（包括该点开始）改变后半部分的指针指向
        ListNode ls = head, le = slow, rs = slow.next, rc = slow.next, rp = null;
        le.next = null;
        while (rc != null) {
            ListNode rn = rc.next;
            rc.next = rp;
            rp = rc;
            rc = rn;
        }
        // 后半部分逆转后的起点
        ListNode re = rp;

        // 合并两个部分[ls, le], [re, rs] 到fake,左边长度等于或大于右边
        while (ls != null && re != null) {
            fake.next = ls;
            ls = ls.next;
            fake.next.next = re;
            re = re.next;
            fake = fake.next.next;
        }
        if (ls != null) {
            fake.next = ls;
        }

    }
}
