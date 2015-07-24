import org.junit.Test;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void testZigzagLevelOrder() throws Exception {
        BinaryTree ta = new BinaryTree(new Integer[]{3, 9, 20, 8, null, 15, 7, null, 11, null,
                null, 2, 4, 5, 6});
        BinaryTreeZigzagLevelOrderTraversal s = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(s.zigzagLevelOrder(ta.getRoot()));
    }
}