package ernest;

/**
 * 2. Add Two Numbers
 * Medium
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur;
        ListNode pre = head;
        int flag = 0;
        while (l1 != null && l2 != null) {
            cur = new ListNode((l1.val + l2.val + flag) % 10);
            flag = (l1.val + l2.val + flag) / 10;
            pre.next = cur;
            pre = cur;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            cur = new ListNode((l1.val + flag) % 10);
            flag = (l1.val + flag) / 10;
            pre.next = cur;
            pre = cur;
            l1 = l1.next;
        }

        while (l2 != null) {
            cur = new ListNode((l2.val + flag) % 10);
            flag = (l2.val + flag) / 10;
            pre.next = cur;
            pre = cur;
            l2 = l2.next;
        }

        if (flag == 1) {
            cur = new ListNode(1);
            pre.next = cur;
        }

        return head.next;
    }
}
