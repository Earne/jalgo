/**
 * 在O(1)时间复杂度删除链表节点
 * 给定一个单链表中的表头和一个等待被删除的节点(非表头或表尾)。
 * 样例
 * <p/>
 * 给定 1->2->3->4，和节点 3，返回 1->2->4。
 * 请在在O(1)时间复杂度删除该链表节点。并在删除该节点后，返回表头。
 */
public class DeleteNodeIntheMiddleofSinglyLinkedList {
    /**
     * @param node: the node in the list should be deleted
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode ne = node.next;
        node.next = node.next.next;
        ne.next = null;
    }
}
