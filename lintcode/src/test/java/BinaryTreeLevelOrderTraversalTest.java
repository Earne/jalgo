import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void testLevelOrder() throws Exception {
        BinaryTreeLevelOrderTraversal s = new BinaryTreeLevelOrderTraversal();
        BinaryTree tree = new BinaryTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        System.out.println(s.levelOrder(tree.getRoot()));
    }
}