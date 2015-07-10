import org.junit.Test;

public class ConvertSortedListtoBinarySearchTreeTest {

    @Test
    public void testSortedListToBST() throws Exception {
        ListNode a = new ListNode(new int[]{0, 1, 2, 3, 4, 5, 6});
        ConvertSortedListtoBinarySearchTree s = new ConvertSortedListtoBinarySearchTree();
        TreeNode t = s.sortedListToBST(a);
        TreeNode.preOrderPrintTree(t);
        System.out.println();
        TreeNode.inOrderPrintTree(t);
    }
}