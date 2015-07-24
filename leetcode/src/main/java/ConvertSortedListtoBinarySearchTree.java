/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 */
public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode root;
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);

        ListNode slow = head;
        ListNode fast = head;
        ListNode preSlow = null;

        while (fast != null && fast.next != null) {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (preSlow != null)
            preSlow.next = null;

        root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }
}
