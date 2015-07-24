import org.junit.Test;

public class FlattenBinaryTreetoLinkedListTest {

    @Test
    public void testFlatten() throws Exception {
        Integer[] a = {1, 2, 3};
        BinaryTree ta = new BinaryTree(a);

        FlattenBinaryTreetoLinkedList s = new FlattenBinaryTreetoLinkedList();
        s.flatten(ta.getRoot());

        TreeNode tmp = ta.getRoot();
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.right;
        }
    }
}