/**
 *  Given a linked list, determine if it has a cycle in it.
 *  Follow up:
 *  Can you solve it without using extra space?
 */
public class LinkedListCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null)
                return false;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
