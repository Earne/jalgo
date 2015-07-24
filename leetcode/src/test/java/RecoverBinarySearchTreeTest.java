import org.junit.Test;

public class RecoverBinarySearchTreeTest {

    @Test
    public void testRecoverTree() throws Exception {
        BinaryTree ta = new BinaryTree(new Integer[]{5, 3, 9, 7, 4, 8, null, null, null, null,
                null, 2});
        TreeNode.preOrderPrintTree(ta.getRoot());
        System.out.println();
        TreeNode.inOrderPrintTree(ta.getRoot());
        RecoverBinarySearchTree s = new RecoverBinarySearchTree();
        s.recoverTree(ta.getRoot());
        System.out.println();
        TreeNode.preOrderPrintTree(ta.getRoot());
        System.out.println();
        TreeNode.inOrderPrintTree(ta.getRoot());
    }
}