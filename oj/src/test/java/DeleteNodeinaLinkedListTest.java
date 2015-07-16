import org.junit.Test;

public class DeleteNodeinaLinkedListTest {

    @Test
    public void testDeleteNode() throws Exception {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = null;

        DeleteNodeinaLinkedList s = new DeleteNodeinaLinkedList();
        s.deleteNode(a3);

        ListNode node = a1;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}